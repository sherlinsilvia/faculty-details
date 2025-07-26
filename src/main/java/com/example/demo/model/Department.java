package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "departments")
public class Department {

    @Id
    private String id;
    private String name;
    private String faculty;

    // Constructors
    public Department() {}

    public Department(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    // Getters & Setters
    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getFaculty() { return faculty; }

    public void setFaculty(String faculty) { this.faculty = faculty; }
}
