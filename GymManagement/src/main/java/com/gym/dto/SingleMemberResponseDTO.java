package com.gym.dto;

import java.time.LocalDate;

import com.gym.entities.Membership;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SingleMemberResponseDTO {
	private Long memberId;
	private String memberName;
	private Integer memberAge;
	private LocalDate joiningDate;
	private Membership membershipPlan;
	private Long trainerId;
}
