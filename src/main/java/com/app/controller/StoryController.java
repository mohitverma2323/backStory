package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.manager.StoryManager;
import com.app.pojo.Story;
@Controller
public class StoryController {
	@Autowired(required=true)
	private StoryManager storyManager;
	
	@RequestMapping(value="/getStory", method=RequestMethod.POST)
	public @ResponseBody String findStoryByTime(@RequestParam Story story){
		Story generatedStory =storyManager.findStory(story);
		return generatedStory.toString();
	}
	
	@RequestMapping(value="/uploadStory",method=RequestMethod.POST)
	public @ResponseBody String uploadStory(@RequestBody Story story){
		storyManager.addNewStoryFromUSer(story, null);
		
		return story.toString();
	}
}
