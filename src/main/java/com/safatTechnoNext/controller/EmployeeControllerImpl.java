package com.safatTechnoNext.controller;

import com.safatTechnoNext.dao.EmployeeDAO;
import com.safatTechnoNext.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeControllerImpl implements EmployeeController{

    private final EmployeeDAO employeeDAO;

    public EmployeeControllerImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public ResponseEntity<Employee> getEmployeeById(long id) {
        Employee employee = employeeDAO.findById(id);

        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
