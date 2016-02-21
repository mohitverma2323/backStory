package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Story;
import com.app.utility.StoryQuery;

@Component
public class StoryDao {
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void persistStory(Story story){
		entityManager.persist(story);
	}
	@SuppressWarnings("unchecked")
	public Iterable<Story> findStory(int timeRequired){
		int time1=0;int time2=3;
		if(timeRequired!=3)
		 {
			time1=timeRequired-2;
			time2=timeRequired;
		}
		Query query= (Query) entityManager.createNativeQuery(StoryQuery.FIND_STORY);
		query.setParameter("time1", time1);
		query.setParameter("time2", time2);
		List<Story> resultList=query.getResultList();
		return resultList;
	}
}
