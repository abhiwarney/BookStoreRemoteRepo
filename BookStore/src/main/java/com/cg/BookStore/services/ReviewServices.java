package com.cg.BookStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.BookStore.beans.Review;
import com.cg.BookStore.daoservices.ReviewDao;
import com.cg.BookStore.exceptions.ReviewNotFoundException;

@Component("reviewServices")
public class ReviewServices implements IReviewService{

	@Autowired
	ReviewDao reviewDao;
	
	@Override
	public Review createReview(Review review) {	
		return reviewDao.save(review);
	}

	@Override
	public boolean updateReview(Review review) {
		reviewDao.save(review);
		return false;
	}

	@Override
	public boolean deleteReview(Integer reviewId) {
		reviewDao.deleteById(reviewId);
		return false;
	}

	@Override
	public Review getReviewDetails(Integer reviewId) {
		return reviewDao.findById(reviewId).orElseThrow(()->new ReviewNotFoundException("Review is either deleted or doesn't exist!!"));
	}

	@Override
	public List<Review> listAllReviews() {
		return reviewDao.findAll();
	}

}
