package com.safatTechnoNext.dao;


import com.safatTechnoNext.model.Attendance;

import java.util.List;

public interface AttendanceDAO {
    List<Attendance> findAllByEmpId(Long emp_id);

    List<Attendance> findAllPresentByEmpId(Long emp_id);
}
