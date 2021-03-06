package com.app.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.StoryDao;
import com.app.pojo.Story;
import com.app.pojo.User;
import com.app.processing.StoryTrimmer;
import com.app.utility.Constants;

@Component
public class StoryManager {
	@Autowired
	private StoryDao storyDao;

	public void processStoryForUpload(Story story) {
		StoryTrimmer storyTrimmer = new StoryTrimmer();
		storyTrimmer.finalCutForStory(story.getStoryContent());
		story.setTimeRequired((storyTrimmer.getWordCount() / Constants.WORDS_READ_BY_AVERAGE_USER_IN_A_MINUTE) + 1);
	}

	public Story findStory(Story story) {
		/*ArrayList<Story> storyList = (ArrayList<Story>) storyDao.findStory(story.getTimeRequired());
		System.out.println(storyList.get(0).toString());
		int size = storyList.size();
		Random randomNumber = new Random();
		int randomStory = randomNumber.nextInt(size);*/
		return storyDao.findStory(story.getTimeRequired());
	}

	public void addNewStoryFromUSer(Story story, User user) {
		try {
			processStoryForUpload(story);
			storyDao.persistStory(story);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
