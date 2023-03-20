package com.safatTechnoNext.dao;
import com.safatTechnoNext.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDAO {

    void save(Employee employee);
    int update(Employee employee);
    Employee findById(Long id);
    int deleteById(Long id);
    List<Employee> findAll();
    int deleteAll();

}
