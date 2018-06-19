package org.wecancodeit.Reviews;

public class Review {

	private long id;
	private String title;
	private String category;
	private String content;
	private String imageUrl;

	public String getImageUrl() {
		return imageUrl;
	}
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}
	
	public String getContent() {
		return content;
	}

	public Review(long id, String title, String category, String content, String imageUrl) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.content = content;
		this.imageUrl = imageUrl;
	}

}
