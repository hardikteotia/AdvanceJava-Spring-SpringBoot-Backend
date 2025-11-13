package com.gym.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.dao.TrainerDAO;
import com.gym.dto.TrainerRequestDTO;
import com.gym.dto.TrainerResponseDTOAllTrainer;
import com.gym.entities.Trainer;

@Service
public class TrainerService {
	
	@Autowired
	private TrainerDAO trainerDaoRefObj;
	@Autowired
	private ModelMapper mapper;

	
	public void addingTrainerService(TrainerRequestDTO trainer) {
		Trainer trn = mapper.map(trainer, Trainer.class);
		trainerDaoRefObj.save(trn);
		
	}


	public List<TrainerResponseDTOAllTrainer> callAllTrainer() {
		List<Trainer> allTrainerList= null;
		allTrainerList = trainerDaoRefObj.findAll();
		List<TrainerResponseDTOAllTrainer> trnRspObjList = new ArrayList<TrainerResponseDTOAllTrainer>();
		
		for(Trainer i: allTrainerList) {
			TrainerResponseDTOAllTrainer t = mapper.map(i, TrainerResponseDTOAllTrainer.class);
			trnRspObjList.add(t);
		}
		return trnRspObjList;
	}
	
	
	
}
