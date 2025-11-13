package com.gym.dto;

import java.time.LocalDate;

import com.gym.entities.Membership;
//import com.gym.entities.Trainer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberRequestDTO {
	//so what am i going to store through json will be stored here first then it will be passed to controller
	//now go to Member controller
	private String memberName;
	private Integer memberAge;
	private LocalDate joiningDate;
	private Membership membershipPlan;
    private Long trainerId; // ✅ store trainer ID instead of full object

	
	
}
