package com.safatTechnoNext.Service;

import com.safatTechnoNext.dao.AttendanceDAO;
import com.safatTechnoNext.model.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService{

    @Autowired
    AttendanceDAO attendanceDAO;

    @Override
    public List<Attendance> findAllPresentByEmpId(long emp_id) {
        List<Attendance> attendances = attendanceDAO.findAllPresentByEmpId(emp_id);
        System.out.println(attendances.size());
        return attendances;
    }
}
