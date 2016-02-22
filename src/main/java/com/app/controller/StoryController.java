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
import com.google.gson.Gson;

@Controller
public class StoryController {
	@Autowired
	private StoryManager storyManager;
	
	@RequestMapping(value="/getStory", method=RequestMethod.GET)
	public @ResponseBody String findStoryByTime(@RequestParam Story story){
		Story generatedStory =storyManager.findStory(story);
		return generatedStory.toString();
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public @ResponseBody String uploadStory(@RequestBody Story story){
		storyManager.addNewStoryFromUSer(story, null);
		Gson gson=new Gson();
		return gson.toJson(story);
	}
}
