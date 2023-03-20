package com.safatTechnoNext.controller;

import com.safatTechnoNext.model.Designation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/designation")
public interface DesignationController {

    @GetMapping("/all")
    ResponseEntity<List<Designation>> findAll();
}
