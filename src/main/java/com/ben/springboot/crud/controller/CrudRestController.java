package com.ben.springboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ben.springboot.crud.entity.Member;
import com.ben.springboot.crud.service.MemberService;

@RestController
@RequestMapping("/api")
public class CrudRestController {
	private MemberService memberService;
	
	@Autowired
	public CrudRestController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/members")
	public List<Member> findAll() {
		return memberService.findAll();
	}
	
	@GetMapping("/members/{memberId}")
	public Member getMember(@PathVariable int memberId) throws Exception {
		Member member = memberService.getMember(memberId);
		if(member==null) {
			throw new RuntimeException("Member ID not found: " + memberId);
		}
		return member;
	}
	
	@PostMapping("/members")
	public Member addMember(@RequestBody Member newMember) {
		newMember.setId(0);
		memberService.saveMember(newMember);
		return newMember;
	}
	
	@PutMapping("/members")
	public Member updateMember(@RequestBody Member member) {

		memberService.saveMember(member);
		return member;
	}
	
	@DeleteMapping("/members/{memberId}")
	public String deleteCustomer(@PathVariable int memberId) {
		Member member = memberService.getMember(memberId);
		if(member == null) {
			throw new RuntimeException("Member ID could not be found: " + memberId);
		}
		memberService.deleteMember(memberId);
		
		return "Deleted Member id: " + memberId;
	}
}
