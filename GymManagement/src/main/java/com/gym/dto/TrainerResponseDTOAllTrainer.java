package com.gym.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TrainerResponseDTOAllTrainer {
	private Long trainerId;
	private String trainername;
	private String trainerspecialization;
	private String trainerexperience;
}
