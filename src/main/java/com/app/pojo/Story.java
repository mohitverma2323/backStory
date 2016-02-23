package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Story {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long storyId;
	@Column
	private String storyTitle;
	@Column
	private String storyContent;
	@Column
	private String storyAuthor;
	@Column
	private Integer timeRequired;
	public Long getStoryId() {
		return storyId;
	}
	public void setStoryId(Long storyId) {
		this.storyId = storyId;
	}
	public String getStoryTitle() {
		return storyTitle;
	}
	public void setStoryTitle(String storyTitle) {
		this.storyTitle = storyTitle;
	}
	public String getStoryContent() {
		return storyContent;
	}
	public void setStoryContent(String storyContent) {
		this.storyContent = storyContent;
	}
	public String getStoryAuthor() {
		return storyAuthor;
	}
	public void setStoryAuthor(String storyAuthor) {
		this.storyAuthor = storyAuthor;
	}
	public Integer getTimeRequired() {
		return timeRequired;
	}
	public void setTimeRequired(Integer timeRequired) {
		this.timeRequired = timeRequired;
	}
	@Override
	public String toString() {
		return "Story [storyId=" + storyId + ", storyTitle=" + storyTitle + ", storyContent=" + storyContent
				+ ", storyAuthor=" + storyAuthor + ", timeRequired=" + timeRequired + "]";
	}
	
	

}
