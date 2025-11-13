package com.gym.dto;

import java.time.LocalDate;

import com.gym.entities.Membership;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MemberResponseDTOAllMember {
	
	private Long memberId;
	private String memberName;
	private Integer memberAge;
	private LocalDate joiningDate;
	private Membership membershipPlan;
	private Long trainerId;
}
