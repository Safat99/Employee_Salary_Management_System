package com.safatTechnoNext.controller;

import com.safatTechnoNext.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/employee")
public interface EmployeeController {

    @GetMapping("/{id}")
    ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id);
}
