package com.app.utility;

public class StoryQuery {
	public final static String FIND_STORY="select * from Story where timeRequired > :time1 and timeRequired <= :time2 ";
}
