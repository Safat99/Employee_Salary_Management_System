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
    public List<SalaryDTO> calculateSalary() {
        String sql = """
                select\s
                	emp_id, username, designation_name, count(*) as total_present_days,\s
                	salary as monthly_salary, count(*) * salary / 19 as allocated_salary
                from attendance a
                join employee e on a.emp_id = e.id\s
                join designation d on d.id = e.designation_id
                where is_present = true
                group by emp_id, username, salary, designation_name;
                """;

        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(SalaryDTO.class));


    }
}
