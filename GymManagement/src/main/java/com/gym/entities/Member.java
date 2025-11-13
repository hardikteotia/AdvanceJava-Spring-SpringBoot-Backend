package com.gym.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*Field	Type	Description
member_id	Long (Auto Generated, Primary Key)	Unique identifier
name	String	Member’s name
age	Integer	Member’s age
join_date	Date	Date of joining
membership_type	String	e.g., Monthly, Yearly
trainer_id	Long (Foreign Key → Trainer Table)	Assigned trainer*/

@Table(name = "members")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "memberID")
	private Long memberId;
	
	@Column(name = "memberName", nullable = false)
	private String memberName;//name1
	@Column(name = "memberAge", nullable = false)
	private Integer memberAge;//12
	@Column(name = "joiningDate", nullable = false)
	private LocalDate joiningDate;//aaj ki date
	@Enumerated(EnumType.STRING)
	private Membership membershipPlan;//default
	
	// Each member is assigned to one trainer
	@ManyToOne
	@JoinColumn(name = "trainerId")
	private Trainer trainer;//that's just a reference
	
}
