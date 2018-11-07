package com.gpch.login.controller;

import com.gpch.login.model.EmployeeShift;
import com.gpch.login.service.EmployeeShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ScheduleController {
    @Autowired
    private EmployeeShiftService employeeShiftService;
    @GetMapping("/admin/schedule")
    public String getSchedule(Model model){
        List<EmployeeShift> list = employeeShiftService.getAllRegistor();
        return "admin/home";
    }
}
