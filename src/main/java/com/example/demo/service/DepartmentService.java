package com.example.demo.service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repo;

    public Department save(Department department) {
        return repo.save(department);
    }

    public List<Department> getAll() {
        return repo.findAll();
    }

    public void deleteById(String id) {
        repo.deleteById(id);
    }
}
