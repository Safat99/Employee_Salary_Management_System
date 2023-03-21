package com.safatTechnoNext.Service;

import com.safatTechnoNext.dao.SalaryDtoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateSalaryServiceImpl implements CalculateSalaryService {

    @Autowired
    SalaryDtoDAO salaryDtoDAO;

    @Override
    public int findWorkingDays(int year, int month) {
        Integer total_days = salaryDtoDAO.findTotalDays(year, month);
        Integer total_off_days = salaryDtoDAO.findOffDays(year, month);

        return total_days - total_off_days;
    }

    @Override
    public List<?> calculateSalaries(int id, int year, int month) {
        int totalWorkingDays = findWorkingDays(year,month);
        return null;
    }


}
