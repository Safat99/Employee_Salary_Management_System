package com.safatTechnoNext.dao;

import com.safatTechnoNext.dto.EmployeeNumberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountGenderDtoDAOImpl implements CountGenderDtoDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<EmployeeNumberDTO> countGender() {

        String sql = """
                select
                	designation_name, gender, count(gender) as count_gender
                from employee e
                join designation d
                on d.id = e.designation_id
                group by designation_name, gender;
                """;

        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(EmployeeNumberDTO.class));
    }

}
