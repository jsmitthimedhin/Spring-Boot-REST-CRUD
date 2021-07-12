package com.ben.springboot.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ben.springboot.crud.entity.Member;

public interface MemberService {
	public List<Member> findAll();

	public Member getMember(int id);

	public void saveMember(Member newMember);

	public void deleteMember(int memberId);
}
