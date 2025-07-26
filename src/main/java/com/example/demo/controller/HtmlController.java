package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HtmlController {

    @Autowired
    private DepartmentService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("department", new Department());
        model.addAttribute("departments", service.getAll());
        return "index";
    }

    @PostMapping("/add")
    public String addDepartment(@ModelAttribute Department department) {
        service.save(department);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable String id) {
        service.deleteById(id);
        return "redirect:/";
    }
}
