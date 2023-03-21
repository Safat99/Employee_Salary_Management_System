package com.safatTechnoNext.dao;

import com.safatTechnoNext.dto.SalaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SalaryDtoDAOImpl implements SalaryDtoDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<SalaryDTO> calculateSalary(int year, int month, int totalWorkingDays) {
        String sql = String.format(
                "select * from calculate_salary_all(%d,%d,%d);", year, month, totalWorkingDays
        );

        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(SalaryDTO.class));
    }

    @Override
    public int findTotalDays(int year, int month) {
        String sql = String.format("select find_total_days(%d, %d)", year, month);
        Integer total_days = jdbcTemplate.queryForObject(sql, Integer.class);
        return total_days;
    }

    @Override
    public SalaryDTO calculateIndividualSalary(int year, int month, int totalWorkingDays, int id) {
        String sql = String.format(
                "select * from calculate_salary_all(%d,%d,%d) where employee_id =%d",
                year,month,totalWorkingDays,id);
        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(SalaryDTO.class));

    }

    @Override
    public int findOffDays(int year, int month) {
        String sql = String.format("select find_offdays(%d, %d)", year, month);
        Integer total_off_days = jdbcTemplate.queryForObject(sql, Integer.class);
        return total_off_days;
    }


}
