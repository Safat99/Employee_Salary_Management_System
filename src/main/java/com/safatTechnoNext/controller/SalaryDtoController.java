package com.safatTechnoNext.controller;

import com.safatTechnoNext.dto.EmployeeNumberDTO;
import com.safatTechnoNext.dto.SalaryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/salaryDto")
public interface SalaryDtoController {
    @GetMapping("/calculateSalaryAll")
    ResponseEntity<List<SalaryDTO>> calculateSalaryAll();

    @GetMapping("/countGender")
    ResponseEntity<List<EmployeeNumberDTO>> countGender();
}
