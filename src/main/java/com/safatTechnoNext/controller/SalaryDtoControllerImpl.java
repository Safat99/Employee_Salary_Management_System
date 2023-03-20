package com.safatTechnoNext.controller;

import com.safatTechnoNext.dao.SalaryDtoDAO;
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

    @Override
    public ResponseEntity<List<SalaryDTO>> calculateSalaryAll() {
        List<SalaryDTO> salaryDTOS =  salaryDtoDAO.calculateSalary();
        return new ResponseEntity<>(salaryDTOS, HttpStatus.OK);
    }
}
