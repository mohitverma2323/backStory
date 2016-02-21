package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.manager.StoryManager;
import com.app.pojo.Story;

@Controller
public class StoryController {
	@Autowired
	private StoryManager storyManager;
	
	@RequestMapping(value="/getStory", method=RequestMethod.GET)
	public @ResponseBody String findStoryByTime(@RequestParam Story story){
		Story generatedStory =storyManager.findStory(story);
		return generatedStory.toString();
	}
}
