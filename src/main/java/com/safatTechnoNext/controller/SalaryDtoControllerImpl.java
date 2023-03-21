package com.safatTechnoNext.controller;

import com.safatTechnoNext.Service.CalculateSalaryService;
import com.safatTechnoNext.dao.CountGenderDtoDAO;
import com.safatTechnoNext.dao.SalaryDtoDAO;
import com.safatTechnoNext.dto.EmployeeNumberDTO;
import com.safatTechnoNext.dto.SalaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaryDtoControllerImpl implements SalaryDtoController{

    @Autowired
    SalaryDtoDAO salaryDtoDAO;

    @Autowired
    CountGenderDtoDAO countGenderDtoDAO;

    @Autowired
    CalculateSalaryService calculateSalaryService;

    @Override
    public ResponseEntity<List<SalaryDTO>> calculateSalaryAll(int year, int month, int totalWorkingDays) {
        List<SalaryDTO> salaryDTOS =  salaryDtoDAO.calculateSalary(year, month, totalWorkingDays);

        return new ResponseEntity<>(salaryDTOS, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<EmployeeNumberDTO>> countGender() {
        List<EmployeeNumberDTO> countGenders = countGenderDtoDAO.countGender();

        return new ResponseEntity<>(countGenders,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<SalaryDTO> calculateSalaries(int id, int year, int month) {
        SalaryDTO salaryDTO = calculateSalaryService.calculateSalaries(id, year, month);
        return new ResponseEntity<>(salaryDTO,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<IntegerWrapper> findWorkingDays(int year, int month) {
        int value = calculateSalaryService.findWorkingDays(year, month);

        return new ResponseEntity<>(new IntegerWrapper(value), HttpStatus.OK);
    }

    private static class IntegerWrapper {
        private int value;

        public IntegerWrapper(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
