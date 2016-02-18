package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StoryStats {

	@Id
	Integer StoryId;
	
	Double time;
	
	Integer words;
	
	public StoryStats()
	{
		
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public Integer getWords() {
		return words;
	}

	public void setWords(Integer words) {
		this.words = words;
	}

	public Integer getStoryId() {
		return StoryId;
	}
	
	
}
