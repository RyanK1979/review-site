package org.wecancodeit.reviewsSite;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewsRepositoryTest {

	private ReviewsRepository underTest;

	private long firstReviewId = 23L;
	private Review firstReview = new Review(firstReviewId, "first review", "description of first thing to review",
			"image", "genre");
	private long secondReviewId = 43L;
	private Review secondReview = new Review(secondReviewId, "second review", "another description", "image", "genre");

	@Test
	public void shouldFindFirstReview() {
		underTest = new ReviewsRepository(firstReview);

		Review result = underTest.findOne(firstReviewId);

		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindSecondCourse() {

		underTest = new ReviewsRepository(firstReview, secondReview);

		Review result = underTest.findOne(secondReviewId);

		assertThat(result, is(secondReview));
	}

}
