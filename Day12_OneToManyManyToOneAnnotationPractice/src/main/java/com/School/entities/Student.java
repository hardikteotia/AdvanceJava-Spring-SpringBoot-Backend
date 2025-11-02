package com.School.entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "students")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student extends BaseEntity{
	
	@AttributeOverride(name = "id", column = @Column (name ="student_id"))
	
	@AttributeOverride(name = "createdOn",
column = @Column(name = "student_created_on"))
	
	@AttributeOverride(name = "lastUpdated",column = @Column(name ="student_last_updated"))
	
	@Column(name = "student_name", length = 20, nullable = false)
	private String name;
	
	@Column(name = "student_email", length = 100, nullable = false, unique = true)
	private String email;
	
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	private Address address;
	
	//no foreign key in this table since its in the child's table, which is address so address will hold the foreign key
}
