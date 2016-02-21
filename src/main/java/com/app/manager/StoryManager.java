package com.app.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.StoryDao;
import com.app.pojo.Story;
import com.app.processing.StoryTrimmer;
import com.app.utility.Constants;

@Component
public class StoryManager {
	@Autowired
	private StoryDao storyDao;
	public void processStoryForUpload(Story story)
	{
		StoryTrimmer storyTrimmer=new StoryTrimmer();
		storyTrimmer.finalCutForStory(story.getStoryContent());
		story.setTimeRequired((storyTrimmer.getWordCount()/Constants.WORDS_READ_BY_AVERAGE_USER_IN_A_MINUTE)+1);
	}
}
