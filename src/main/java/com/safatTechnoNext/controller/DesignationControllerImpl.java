package com.safatTechnoNext.controller;

import com.safatTechnoNext.dao.DesignationDAO;
import com.safatTechnoNext.model.Designation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DesignationControllerImpl implements DesignationController {

    @Autowired
    DesignationDAO designationDAO;

    @Override
    public ResponseEntity<List<Designation>> findAll() {
        List<Designation> designations = designationDAO.findAll();
//        for (Designation d : designations) {
//            System.out.println(d.getDesignation_name());
//        }
        return new ResponseEntity<>(designations, HttpStatus.OK);
    }
}
