package org.wecancodeit.reviewsSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewsRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewsRepository() {
		Review Fortnite = new Review(21L, "Fortnite",
				"Battle royale gameplay done in the third person.  You start off parachuting into the world."
						+ "Then with your team you are vying to be the last team standing.  You can loot fallen enemies, find loot boxes, and build defenses, and "
						+ "even some traps!",
				"/images/fortnight.jpg", "Battle Royale");
		Review PubG = new Review(22L, "PlayersUnknown's Battlegrounds",
				"Very similar to fortnight.  The graphics are not quite as evolved.  The gameplay tends to be a bit faster paced, and you can not out run the storm like you can in fortnight.  So you really need to think a little further ahead.  The vehicles are a nice added touch, who doesn't enjoy running over the guy trying to be clever and camping in bushes?",
				"/images/pubg.jpg", "BattleRoyale");
		Review Battlefield = new Review(23L, "Battlefield 1",
				"Takes place in WW1.  The maps are massive, and the 100 person battles really give it an epic feeling at times.  I like the touch of being able to ride a horse, and use your sword to take out an enemy.  The graphics are termendous, and the gameplay is very tight.",
				"/images/Battlefield.jpg", "FPS");
		Review Madden18 = new Review(24L, "Madden 18",
				"The only option in NFL games due to EA's licensing.  This tends to lead to a slower upgrade model.  So this game feels alot like last years, just with updated rosters.  The Browns are still atrocious so I spend most of my time in Franchise mode trying to build the winner that life hasn't given me.",
				"/images/Madden.jpg", "Football");
		Review NBA2K18 = new Review(25L, "NBA2K18",
				"The quinessential NBA game, I feel like they have taken there focus a little to much into the realm of MyCareer mode which I am not the biggest fan.  Thankfully the Cavs are still good, and LeBron is still rediculous, and the rosters are updated so I don't have to see Isiah Thomas anymore.  Great game if you can get past them pestering you for microtransactions.",
				"/images/nba2k.jpg", "Basketball");

		reviews.put(Fortnite.getId(), Fortnite);
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
