package org.wecancodeit.reviewsSite;

public class Review {

	private Long reviewId;
	private String product;
	private String review;
	private String imageUrl;
	private String genre;

	public Review(long reviewId, String product, String review, String imageUrl, String genre) {
		this.reviewId = reviewId;
		this.product = product;
		this.review = review;
		this.imageUrl = imageUrl;
		this.genre = genre;
	}

	public Long getId() {
		return reviewId;
	}

	public String getProduct() {
		return product;
	}

	public String getGenre() {
		return genre;
	}

	public String getUrl() {
		return imageUrl;
	}

	public String getReview() {
		return review;
	}

}
