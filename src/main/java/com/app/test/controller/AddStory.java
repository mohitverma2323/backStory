package com.app.test.controller;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.manager.StoryManager;
import com.app.pojo.Story;

public class AddStory {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private BufferedReader br;
	@Before
	public void setUp() throws Exception {
		entityManagerFactory=Persistence.createEntityManagerFactory("backStory");
		entityManager=entityManagerFactory.createEntityManager();
		br=new BufferedReader(new InputStreamReader(System.in));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {
		StoryManager s=new StoryManager();
		System.out.println("data do");
		Story story=new Story();
		story.setStoryAuthor(br.readLine());
		story.setStoryTitle(br.readLine());
		story.setStoryContent(br.readLine());
		s.processStoryForUpload(story);
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(story);
			entityManager.getTransaction().commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
