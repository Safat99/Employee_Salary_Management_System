package com.safatTechnoNext.dao;

import com.safatTechnoNext.dto.SalaryDTO;

import java.util.List;

public interface SalaryDtoDAO {

    List<SalaryDTO> calculateSalary(int year, int month, int totalWorkingDays);

    int findOffDays(int year, int month);
    int findTotalDays(int year, int month);

    SalaryDTO calculateIndividualSalary(int year, int month, int totalWorkingDays, int id);
}
