package com.app.processing;	

public class StoryTrimmer {
	private String editedStory;

	public StoryTrimmer() {
		editedStory = "";
	}

	public String getEditedStory() {
		return editedStory;
	}

	public void finalCutForStory(String uneditedStory) {
		uneditedStory.trim();
		int wordCount = 0;
		int length = uneditedStory.length();
		for (int i = 1; i < length; i++) {
			char c = uneditedStory.charAt(i);
			if(c=='\t')
				c=' ';
			if (c != ' ')
				editedStory += c;
			else if (c == ' ' && (uneditedStory.charAt(i - 1) == ' ' || uneditedStory.charAt(i-1)=='\t'))
				continue;
			else {
				wordCount++;
				editedStory+=c;
			}
		}
		System.out.println(editedStory);
		System.out.println(wordCount);

	}

	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String story = br.readLine();
		StoryTrimmer storyTrimmer = new StoryTrimmer();
		storyTrimmer.finalCutForStory(story);
	}*/
}
