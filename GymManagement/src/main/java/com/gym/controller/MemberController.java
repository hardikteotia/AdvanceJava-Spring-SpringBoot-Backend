package com.gym.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.dto.MemberRequestDTO;
import com.gym.dto.MemberResponseDTOAllMember;
import com.gym.dto.SingleMemberResponseDTO;
import com.gym.entities.Member;
import com.gym.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService serviceObjRef;
	
	
	@PostMapping("/add")
	public String addnewmember(@RequestBody MemberRequestDTO member) {
		
		serviceObjRef.addingMemberService(member);
		return "Added Member Successfully";
	}
	
	@GetMapping("/getMembers")
	public List<MemberResponseDTOAllMember> getAllMembers(){
		List<MemberResponseDTOAllMember> membersList = null;
		membersList = serviceObjRef.callingAllMembers();
		return membersList;
	}
	
	@GetMapping("/getparticularmember/{id}")
	public SingleMemberResponseDTO getOneMember(@PathVariable Long id) {
		SingleMemberResponseDTO member;
		member = serviceObjRef.callingOneMember(id);
		
		return member;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteMember(@PathVariable Long id) {
		serviceObjRef.deleteOneMember(id);
	}
}
