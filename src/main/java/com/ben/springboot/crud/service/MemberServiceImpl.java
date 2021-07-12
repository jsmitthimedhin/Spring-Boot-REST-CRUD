package com.ben.springboot.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ben.springboot.crud.dao.ChurchDAO;
import com.ben.springboot.crud.entity.Member;

@Service
public class MemberServiceImpl implements MemberService {

	private ChurchDAO churchDAO;
	
	public MemberServiceImpl(ChurchDAO churchDAO) {
		this.churchDAO = churchDAO;
	}
	
	@Override
	@Transactional
	public List<Member> findAll() {
		return churchDAO.findAll();
	}

	@Override
	@Transactional
	public Member getMember(int id) {
		return churchDAO.getMember(id);
	}

	@Override
	@Transactional
	public void saveMember(Member newMember) {
		churchDAO.saveMember(newMember);
	}

	@Override
	@Transactional
	public void deleteMember(int memberId) {
		churchDAO.deleteMember(memberId);
		
	}

}
