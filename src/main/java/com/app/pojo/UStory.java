package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UStory {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id") 
	Integer StoryID;
	
	String Title;
	
    String Content;
    
    String Author;
    
    public UStory()
    {
    	
    }

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getAuthor() {
		return Author;
	}

	public Integer getStoryID() {
		return StoryID;
	}

	public void setAuthor(String author) {
		Author = author;
	}
    
    

}
