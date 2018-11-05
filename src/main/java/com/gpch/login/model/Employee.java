package com.gpch.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column
    private String address;
    @Column(name = "number_phone")
    private String numberPhone;
    @Column
    private String email;
    @Column
    private String gender;
    @OneToMany( cascade =CascadeType.ALL)
    @JoinColumn(name = "check_id")
    List<Ckeck> ckecks;


}
