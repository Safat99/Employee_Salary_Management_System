package com.safatTechnoNext.dao;

import com.safatTechnoNext.model.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.beans.BeanProperty;
import java.util.List;

@Repository
public class AttendanceDAOImpl implements AttendanceDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<Attendance> findAllByEmpId(Long emp_id) {
        return jdbcTemplate.query(
                "select * from attendance where emp_id =?",
                BeanPropertyRowMapper.newInstance(Attendance.class), emp_id);
    }

    @Override
    public List<Attendance> findAllPresentByEmpId(Long emp_id) {
        return jdbcTemplate.query(
                "select * from attendance where emp_id = ? and is_present=true",
                BeanPropertyRowMapper.newInstance(Attendance.class), emp_id);
    }

}
