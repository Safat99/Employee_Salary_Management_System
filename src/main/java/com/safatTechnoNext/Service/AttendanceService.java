package com.safatTechnoNext.Service;

import com.safatTechnoNext.dao.AttendanceDAO;
import com.safatTechnoNext.model.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AttendanceService {

    List<Attendance> findAllPresentByEmpId(long emp_id);
}
