package com.safatTechnoNext.controller;

import com.safatTechnoNext.Service.AttendanceService;
import com.safatTechnoNext.dao.AttendanceDAO;
import com.safatTechnoNext.model.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttendanceControllerImpl implements AttendanceController{

    @Autowired
    AttendanceDAO attendanceDAO;

    @Autowired
    AttendanceService attendanceService;

    @Override
    public ResponseEntity<List<Attendance>> findAllByEmpId(long emp_id) {
        try {
            List<Attendance> attendances = attendanceDAO.findAllByEmpId(emp_id);

            if (attendances.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(attendances, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

//        List<Attendance> attendances = attendanceDAO.findAllByEmpId(emp_id);


    }

    @Override
    public ResponseEntity<List<Attendance>> findAllPresentByEmpId(long emp_id) {

        List<Attendance> attendances = attendanceService.findAllPresentByEmpId(emp_id);

        return new ResponseEntity<>(attendances, HttpStatus.OK);
    }


}
