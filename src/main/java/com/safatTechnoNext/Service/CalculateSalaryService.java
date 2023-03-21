package com.safatTechnoNext.Service;

import com.safatTechnoNext.dto.SalaryDTO;

import java.util.List;

public interface CalculateSalaryService {
    int findWorkingDays(int year, int month);

    SalaryDTO calculateSalaries(int id, int year, int month);
}
