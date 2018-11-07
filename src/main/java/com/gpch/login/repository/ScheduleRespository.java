package com.gpch.login.repository;

import com.gpch.login.model.EmployeeShift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRespository extends JpaRepository<EmployeeShift, Integer> {
}
