package com.example.demo.repository;

import com.example.demo.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, String> {
}
