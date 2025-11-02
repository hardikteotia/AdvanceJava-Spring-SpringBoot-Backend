package com.School.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "addresses")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address extends BaseEntity{
	
@Column(length = 20)
private String city;

@Column(length = 20)
private String state;

@Column(length = 6)
private String pinCode;

@OneToOne
@JoinColumn(name = "student_id")
private Student student;
	
}
