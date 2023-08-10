package com.ivoyant.springdemoodcassandradb.controller;

import com.ivoyant.springdemoodcassandradb.entity.Student;
import com.ivoyant.springdemoodcassandradb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/students/")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping("createStudents")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @PutMapping("updateStudents/{id}")
    @CachePut(value = "students",key = "#id")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") String id) {
        return studentService.updateStudent(student, id);
    }
    @DeleteMapping("deleteStudents/{id}")
    @CacheEvict(value = "students", allEntries = true)
    public String deleteStudent(@PathVariable("id") String id) {
        return studentService.deleteStudent(id);
    }
    @GetMapping("students/{id}")
    @Cacheable(value = "students",key = "#id")
    public Optional<Student> getStudentBYID(@PathVariable("id") String id){
        return  studentService.getStudentByID(id);
    }
}