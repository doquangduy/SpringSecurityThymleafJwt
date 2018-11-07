package com.gpch.login.service;

import com.gpch.login.model.EmployeeShift;
import com.gpch.login.repository.ScheduleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeShiftService {
    @Autowired
    ScheduleRespository scheduleRespository;
    public List<EmployeeShift> getAllRegistor(){
       return scheduleRespository.findAll();
    }
}
