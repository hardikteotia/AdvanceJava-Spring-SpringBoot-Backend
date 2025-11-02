package com.Company.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
 *  Entity	Role	Relationship
 *  
	Department	Parent	Has many employees
	Employee	Child	Belongs to one department
*/
@Entity
@Table(name = "departments")
@Getter
@Setter
@ToString
public class Department extends BaseEntity{
	
	@AttributeOverride(name = "id", column = @Column(name ="dept_id"))
	@AttributeOverride(name = "createdOn", column = @Column(name ="dept_created_on"))
	@AttributeOverride(name = "lastUpdated", column = @Column(name ="dept_last_updated"))
	
	@Column(length = 20)
	private String name;
	
	@Column(length = 30)
	private String location;
	
    // 1 Department → Many Employees
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees = new ArrayList<>();

    // helper method for bidirectional sync
    public void addEmployee(Employee e) {
        employees.add(e);
        e.setDepartment(this);
    }

}
