package com.app.dao;

import java.util.ArrayList;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Story;

@Component
public class StoryDao {
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void persistStory(Story story){
		entityManager.persist(story);
	}
	@SuppressWarnings("unchecked")
	public Story findStory(int timeRequired){
		int time1=0;int time2=3;
		if(timeRequired!=3)
		 {
			time1=timeRequired-2;
			time2=timeRequired;
		}
		/*Query query= (Query) entityManager.createNativeQuery(StoryQuery.FIND_STORY);
		query.setParameter("time1", time1);
		query.setParameter("time2", time2);
		ArrayList<Story> resultList= (ArrayList<Story>) query.getResultList();*/
		ArrayList<Story> stories = (ArrayList<Story>) entityManager.createQuery("Select s from Story s WHERE timeRequired > "+time1+" and timeRequired <= "+time2).getResultList();
		System.out.println("stories are "+stories.toString());   	
		int n = randomNumberGenerator(0,stories.size()-1);
		return stories.get(n);
	}
	
	private int randomNumberGenerator(int min, int max)
	 {
	
      Random rand = new Random();
     
     
      int randomNum = rand.nextInt((max - min) + 1) + min;

      return randomNum;
		
	 }
}
