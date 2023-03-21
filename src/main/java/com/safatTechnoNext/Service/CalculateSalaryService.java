package com.safatTechnoNext.Service;

import java.util.List;

public interface CalculateSalaryService {
    int findWorkingDays(int year, int month);

    List<?> calculateSalaries(int id, int year, int month);
}
