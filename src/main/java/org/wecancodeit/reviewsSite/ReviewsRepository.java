package org.wecancodeit.reviewsSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewsRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewsRepository() {
		Review Fortnight = new Review(21L, "Fortnight", "Fortnight Description");
		Review PubG = new Review(22L, "PubG", "PubG Description");
		Review Battlefield = new Review(23L, "Battlefield 1", "Battlefield1 Description");

		reviews.put(Fortnight.getId(), Fortnight);
		reviews.put(PubG.getId(), PubG);
		reviews.put(Battlefield.getId(), Battlefield);

	}

	public ReviewsRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

	public Review findOne(Long reviewId) {
		return reviews.get(reviewId);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

}
