package com.ivoyant.springdemoodcassandradb.repository;

import com.ivoyant.springdemoodcassandradb.entity.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface StudentRepository extends CassandraRepository<Student, UUID> {
}
