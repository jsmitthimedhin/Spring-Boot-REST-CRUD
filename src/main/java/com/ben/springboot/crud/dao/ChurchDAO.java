package com.ben.springboot.crud.dao;

import java.util.List;

import com.ben.springboot.crud.entity.Member;

public interface ChurchDAO {
	public List<Member> findAll();

	public Member getMember(int id);

	public void saveMember(Member newMember);

	public void deleteMember(int memberId);
}
