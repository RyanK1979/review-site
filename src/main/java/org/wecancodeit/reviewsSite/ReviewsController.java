package org.wecancodeit.reviewsSite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {

	@Resource
	ReviewsRepository reviewsRepo = new ReviewsRepository();

	@RequestMapping(value = "reviews")
	public String getAllCourses(Model model) {
		model.addAttribute("reviews", reviewsRepo.findAll());
		return "reviews";
	}

	@RequestMapping("review")
	public String getACourse(@RequestParam Long id, Model model) {
		model.addAttribute("reviews", reviewsRepo.findOne(id));
		return "review";
	}

}
