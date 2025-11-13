package com.gym.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SingleTrainerResponseDTO {
	
	
	private Long trainerId;
	private String trainername;
	private String trainerspecialization;
	private Integer trainerexperience;
}
