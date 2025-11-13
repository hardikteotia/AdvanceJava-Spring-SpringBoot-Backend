package com.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.dto.TrainerRequestDTO;
import com.gym.dto.TrainerResponseDTOAllTrainer;
import com.gym.entities.Trainer;
import com.gym.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
	
	@Autowired
	private TrainerService serviceRefObj;
	
	@PostMapping("/addtrainer")
	public String AddingNewTrainer(@RequestBody TrainerRequestDTO trainer) {
		serviceRefObj.addingTrainerService(trainer);
		return "Successfully Added";
	}
	
	@GetMapping("/displaytrainers")
	public List<TrainerResponseDTOAllTrainer> getAllTrainers(){
		
		List<TrainerResponseDTOAllTrainer> trainersList = null;
		trainersList = serviceRefObj.callAllTrainer();
		
		return trainersList;
		
	}
	
}
