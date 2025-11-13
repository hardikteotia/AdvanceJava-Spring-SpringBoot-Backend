package com.gym.service;

import com.gym.entities.*;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.dao.MemberDAO;
import com.gym.dao.TrainerDAO;
import com.gym.dto.MemberRequestDTO;
import com.gym.dto.MemberResponseDTOAllMember;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDaoRef;//it will talk to the trainer database
	
	@Autowired
	private TrainerDAO trainerDaoRef;//it will talk to the member database
	 
	@Autowired
	private ModelMapper mapper;//it will map the DTO to the entities
	
	public void addingMemberService(MemberRequestDTO member) {
		
		
		//step 1: map your object with entity using mapper
		Member mem = mapper.map(member, Member.class);/*till this step inside 
		my member object trainer id is null cuz mapper will try to map trainer id with trainer object which is
		not possible */
		
		//step2: ab ek trainer utha isme se object uska
		Trainer trainer = trainerDaoRef.findById(member.getTrainerId()).orElse(null);
		
		mem.setTrainer(trainer);//here we got the object of trainer which is having every field of trainer object as
		//null but not id cuz we got the id from the trainer's table which was inside the member's object
		
		memberDaoRef.save(mem);//now with that object we are just putting that object in the member's table having id = whatever it was
//		Member mem = mapper.map(member, Member.class);
//		
//        Trainer trainer = trainerDaoRef.findById(member.getTrainerId())
//                    .orElse(null);  // You could throw an exception if not found
//        mem.setTrainer(trainer);
//        
//		memberDaoRef.save(mem);
	}

	public List<MemberResponseDTOAllMember> callingAllMembers() {
		List<Member> membersList = null;
		
		membersList = memberDaoRef.findAll();
		List<MemberResponseDTOAllMember> dtoMembers = new ArrayList<>();
		MemberResponseDTOAllMember refObj = new MemberResponseDTOAllMember();
		
		for(Member i:membersList) {
			
			refObj = mapper.map(i, MemberResponseDTOAllMember.class);
			refObj.setTrainerId(i.getTrainer().getTrainerId());
			dtoMembers.add(refObj);
		}
		return dtoMembers;
	}

}
