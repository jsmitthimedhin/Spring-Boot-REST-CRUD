package com.ben.springboot.crud.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ben.springboot.crud.entity.Member;

@Repository
public class ChurchDAOJpaImpl implements ChurchDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public ChurchDAOJpaImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Member> findAll() {
		Query query = entityManager.createQuery("FROM Member", Member.class);
		List<Member> members = query.getResultList();
		System.out.println("Getting the query: " + members);
		return members;
	}
	
	@Override
	public Member getMember(int id) {
		Member member = entityManager.find(Member.class, id);
		return member;
	}
	
	@Override
	public void saveMember(Member newMember) {
		Member dbMember = entityManager.merge(newMember);
		newMember.setId(dbMember.getId());
			
		}

	@Override
	public void deleteMember(int id) {
		Member member = entityManager.find(Member.class, id);
		entityManager.remove(member);
			
	}

}
