package com.Company.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "department")
public class Employee extends BaseEntity {

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50)
    private String role;


    private double salary;

    // Many Employees → One Department
    @ManyToOne
    @JoinColumn(name = "department_id")  // FK column
    private Department department;
}

