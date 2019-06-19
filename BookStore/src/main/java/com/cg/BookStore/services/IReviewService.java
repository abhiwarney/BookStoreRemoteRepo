package com.cg.BookStore.services;

import java.util.List;

import com.cg.BookStore.beans.Review;

public interface IReviewService {
public Review createReview(Review review);
public boolean updateReview(Review review);
public boolean deleteReview(Integer reviewId);
public Review getReviewDetails(Integer reviewId);
public List<Review> listAllReviews();
}
