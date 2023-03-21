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
    public List<SalaryDTO> calculateSalary(int totalWorkingDays) {
        String sql = String.format(
                """
                select\s
                	emp_id, username, designation_name, count(*) as total_present_days,\s
                	salary as monthly_salary, count(*) * salary / %d as allocated_salary
                from attendance a
                join employee e on a.emp_id = e.id\s
                join designation d on d.id = e.designation_id
                where is_present = true
                group by emp_id, username, salary, designation_name;
                """,
                totalWorkingDays
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
    public int findOffDays(int year, int month) {
        String sql = String.format("select find_offdays(%d, %d)", year, month);
        Integer total_off_days = jdbcTemplate.queryForObject(sql, Integer.class);
        return total_off_days;
    }


}
