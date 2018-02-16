package org.wecancodeit.reviewsSite;

public class Review {

	private Long reviewId;
	private String product;
	private String review;

	public Review(long reviewId, String product, String review) {
		this.reviewId = reviewId;
		this.product = product;
		this.review = review;
	}

	public Long getId() {
		return reviewId;
	}

	public String getProduct() {
		return product;
	}

	public String getReview() {
		return review;
	}

}
