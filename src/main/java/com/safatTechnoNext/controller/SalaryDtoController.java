package com.safatTechnoNext.controller;

import com.safatTechnoNext.dto.EmployeeNumberDTO;
import com.safatTechnoNext.dto.SalaryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/api/salaryDto")
public interface SalaryDtoController {
    @GetMapping("/calculateSalaryAll")
    ResponseEntity<List<SalaryDTO>> calculateSalaryAll(@RequestParam int year, @RequestParam int month, @RequestParam int totalWorkingDays);

    @GetMapping("/countGender")
    ResponseEntity<List<EmployeeNumberDTO>> countGender();

    @GetMapping("/findWorkingDays")
    ResponseEntity<?> findWorkingDays(@RequestParam int year, @RequestParam int month);

    @GetMapping("/calculateIndividualSalary")
    ResponseEntity<SalaryDTO> calculateSalaries(@RequestParam int id, @RequestParam int year, @RequestParam int month);
}
