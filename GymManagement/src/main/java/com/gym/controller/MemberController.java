package com.gym.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.dto.MemberRequestDTO;
import com.gym.dto.MemberResponseDTOAllMember;
import com.gym.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService serviceObjRef;
	
	
	@PostMapping("/add")
	public String addNewMember(@RequestBody MemberRequestDTO member) {
		
		serviceObjRef.addingMemberService(member);
		return "Added Member Successfully";
	}
	
	@GetMapping("/getMembers")
	public List<MemberResponseDTOAllMember> getAllTrainers(){
		List<MemberResponseDTOAllMember> membersList = null;
		membersList = serviceObjRef.callingAllMembers();
		return membersList;
	}
	
	@GetMapping
}
