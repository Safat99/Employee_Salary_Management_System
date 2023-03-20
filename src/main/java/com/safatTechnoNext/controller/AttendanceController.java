package com.safatTechnoNext.controller;

import com.safatTechnoNext.model.Attendance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/attendance/")
public interface AttendanceController {

    @GetMapping("/{emp_id}")
    ResponseEntity<List<Attendance>> findAllByEmpId(@PathVariable("emp_id") long emp_id);

    @GetMapping("/present/{emp_id}")
    ResponseEntity<List<Attendance>> findAllPresentByEmpId(@PathVariable("emp_id") long emp_id);

}
