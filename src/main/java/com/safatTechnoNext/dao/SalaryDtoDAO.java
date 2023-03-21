package com.safatTechnoNext.dao;

import com.safatTechnoNext.dto.SalaryDTO;

import java.util.List;

public interface SalaryDtoDAO {

    List<SalaryDTO> calculateSalary(int totalWorkingDays);

    int findOffDays(int year, int month);
    int findTotalDays(int year, int month);
}
