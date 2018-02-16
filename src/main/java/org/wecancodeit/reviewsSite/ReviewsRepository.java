package org.wecancodeit.reviewsSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewsRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewsRepository() {
		Review Fortnight = new Review(21L, "Fortnight", "Fortnight Description", "imageurl", "genre");
		Review PubG = new Review(22L, "PubG", "PubG Description", "imageurl", "genre");
		Review Battlefield = new Review(23L, "Battlefield 1", "Battlefield1 Description", "imageurl", "genre");
		Review Madden18 = new Review(24L, "Madden 18", "Madden Description", "imageurl", "genre");
		Review NBA2K18 = new Review(25L, "NBA2K18", "NBA2K18 Description", "imageurl", "genre");

		reviews.put(Fortnight.getId(), Fortnight);
		reviews.put(PubG.getId(), PubG);
		reviews.put(Battlefield.getId(), Battlefield);
		reviews.put(Madden18.getId(), Madden18);
		reviews.put(NBA2K18.getId(), NBA2K18);

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
