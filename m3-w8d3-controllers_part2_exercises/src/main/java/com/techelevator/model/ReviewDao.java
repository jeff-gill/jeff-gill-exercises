package com.techelevator.model;

import java.util.List;

public interface ReviewDao {

	public List<Review> getAllReviews(String userName, String userRating, String userReviewTitle, String userReviewBody);
	public void save(Review post);
	List<Review> getAllReviews();
}
