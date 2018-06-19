package org.wecancodeit.Reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
	
	@Resource
	ReviewRepository reviewRepo;
	
	@RequestMapping("/show-reviews")
	public String findAllReviews(Model model) {
		//Model called "reviews" as a reference for thymeleaf template given in html
		model.addAttribute("reviews", reviewRepo.findAll());
		
		//return thymeleaf template
		return "reviews";
	}
	
	@RequestMapping("/review")
	
	public String findOneReview(@RequestParam(value="id")Long id, Model model) {
		model.addAttribute("reviews", reviewRepo.findOne(id));
		return "review";
	}

}
