package com.gpch.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_shift")
public class  EmployeeShift{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Shift shift;
    @ManyToOne
    private Employee employee;
    @Column(name = "is_active", nullable = false,columnDefinition = "boolean default false")
    private Boolean active;
}
