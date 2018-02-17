package org.wecancodeit.reviewsSite;

public class Review {

	private Long reviewId;
	private String product;
	private String review;
	private String image;
	private String genre;

	public Review(long reviewId, String product, String review, String image, String genre) {
		this.reviewId = reviewId;
		this.product = product;
		this.review = review;
		this.image = image;
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

	public String getImage() {
		return image;
	}

	public String getReview() {
		return review;
	}

}
