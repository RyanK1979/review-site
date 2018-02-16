package org.wecancodeit.reviewsSite;

import javax.annotation.Resources;

import org.springframework.stereotype.Controller;

@Controller
public class ReviewsController {

	@Resources
	ReviewsRepository repository = new ReviewsRepository();

}
