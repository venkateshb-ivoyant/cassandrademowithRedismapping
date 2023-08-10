package com.ivoyant.springdemoodcassandradb.service;
import com.ivoyant.springdemoodcassandradb.entity.Student;
import com.ivoyant.springdemoodcassandradb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public Student updateStudent(Student student, String id){
        var existingStudent = studentRepository.findById(UUID.fromString(id));
        if(!existingStudent.isPresent())
            throw new RuntimeException("Student not found!!");
        student.setId(UUID.fromString(id));
        return studentRepository.save(student);
    }
    public Optional<Student> getStudentByID(String id){

        return studentRepository.findById(UUID.fromString(id));
    }
    public String deleteStudent(String id){
        studentRepository.deleteById(UUID.fromString(id));
        return "Student deleted successfully";
    }
}
