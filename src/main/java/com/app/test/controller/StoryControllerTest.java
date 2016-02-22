package com.app.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.app.pojo.Story;

@Controller
public class StoryControllerTest {
	
	
	@RequestMapping(value="/testGetStory", method=RequestMethod.GET)
	public String getStory(){
		Story story=new Story();
		story.setTimeRequired(3);
		return "forward:/getStory?story=null";
	}
}
