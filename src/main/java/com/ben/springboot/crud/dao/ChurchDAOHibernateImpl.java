package com.ben.springboot.crud.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ben.springboot.crud.entity.Member;

@Repository
public class ChurchDAOHibernateImpl implements ChurchDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public ChurchDAOHibernateImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Member> findAll() {
		Session session = entityManager.unwrap(Session.class);
		
		Query<Member> query = session.createQuery("from Member", Member.class);
		List<Member> members = query.getResultList();
		System.out.println("Getting the query: " + members);
		return members;
	}
	
	@Override
	public Member getMember(int id) {

		// get the current hibernate session
		Session session = entityManager.unwrap(Session.class);
		
		// now retrieve/read from database using the primary key
		Member member = session.get(Member.class, id);
		
		return member;
	}
	
	@Override
	public void saveMember(Member newMember) {

			// get current hibernate session
			Session session = entityManager.unwrap(Session.class);
			
			// save/upate the customer
			session.saveOrUpdate(newMember);
		}

	@Override
	public void deleteMember(int id) {
		Session session = entityManager.unwrap(Session.class);
		Member member = session.get(Member.class, id);
		session.delete(member);
			
	}

}
