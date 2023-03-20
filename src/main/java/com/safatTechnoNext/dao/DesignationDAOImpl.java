package com.safatTechnoNext.dao;

import com.safatTechnoNext.model.Attendance;
import com.safatTechnoNext.model.Designation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DesignationDAOImpl implements DesignationDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Designation> findAll() {
        return jdbcTemplate.query(
                "select * from designation",
                BeanPropertyRowMapper.newInstance(Designation.class)
        );
    }
}
