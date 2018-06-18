package org.wecancodeit.review;

public class Review {
	
	private Long id;
	private String reviewName;
	private String imgUrl;
	private String reviewCategory;
	private String reviewContent;
	private String synopsis;

	public Review(Long id, String reviewName, String imgUrl, String reviewCategory, String reviewContent,
			String synopsis) {
		this.id = id;
		this.reviewName = reviewName;
		this.imgUrl = imgUrl;
		this.reviewCategory = reviewCategory;
		this.reviewContent = reviewContent;
		this.synopsis = synopsis;
		

	}

	public Long getID() {
		return id;
		
	}
	
	public String getitemTitle() {
		return reviewName;
	}
	
	public String getImgUrl() {
		return imgUrl;
		
	}
	
	public String getReviewCategory() {
		return reviewCategory;
	}
	
	public String getReviewContent() {
		return reviewContent;
		
	}
	
	public String ThisSynopsis() {
		return synopsis;
	}

}
