package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.manager.StoryManager;
import com.app.pojo.Story;
import com.google.gson.Gson;
@Controller
public class StoryController {
	@Autowired(required=true)
	private StoryManager storyManager;
	
	@RequestMapping(value="/getStory", method=RequestMethod.POST)
	public @ResponseBody String findStoryByTime(@RequestBody String reqStory){
		Gson gSon = new Gson();
		System.out.println(reqStory);
		Story story = gSon.fromJson(reqStory, Story.class);
		System.out.println(story);
		Story generatedStory =storyManager.findStory(story);
	  	String responseStory = gSon.toJson(generatedStory);
        return responseStory;
	}
	@RequestMapping(value="/uploadStory",method=RequestMethod.POST)
	public @ResponseBody String uploadStory(@RequestBody String story){
		Gson gSon = new Gson();
		Story userStory = gSon.fromJson(story, Story.class);
		storyManager.addNewStoryFromUSer(userStory, null);
		return story;
	}
	
}
