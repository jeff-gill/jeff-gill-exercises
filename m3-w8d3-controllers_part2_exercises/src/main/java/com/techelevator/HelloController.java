package com.techelevator;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class HelloController {

	@Autowired
	private ReviewDao reviewDao;

	@RequestMapping("/homePage")
	public String displayHomepage() {

		return "homePage";
	}

	@RequestMapping("/reviewSubmit")
	public String reviewSubmit() {

		return "reviewSubmit";
	}

	@RequestMapping(path = "/readReviewsPage", method = RequestMethod.POST)
	public String readReviewsPage(HttpServletRequest userReview, @RequestParam String reviewTitle,
			@RequestParam String username, @RequestParam String rating, @RequestParam String reviewBody) {
		userReview.setAttribute("methodUsed", "Pose-Request-Params");
		
		String requestUserName = userReview.getParameter("username");
		String requestUserRating = userReview.getParameter("rating");
		String requestUserReviewTitle = userReview.getParameter("reviewTitle");
		String requestUserReviewBody = userReview.getParameter("reviewBody");

		List<Review> userReviewList = reviewDao.getAllReviews(requestUserName, requestUserRating,
				requestUserReviewTitle, requestUserReviewBody);
		userReview.setAttribute("userReview ", userReviewList);
		return "readReviewsPage";
	}
}
