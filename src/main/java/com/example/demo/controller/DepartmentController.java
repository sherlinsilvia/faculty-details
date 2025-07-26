package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    // Create department
    @PostMapping
    public Department addDepartment(@RequestBody Department dept) {
        return service.save(dept);
    }

    // Get all departments
    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAll();
    }

    // Delete by ID
    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable String id) {
        service.deleteById(id);
    }

    // ❌ DO NOT include any @GetMapping("/") here to avoid conflict with HtmlController
}
