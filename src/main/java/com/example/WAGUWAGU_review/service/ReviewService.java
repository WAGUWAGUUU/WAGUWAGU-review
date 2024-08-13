package com.example.WAGUWAGU_review.service;

import com.example.WAGUWAGU_review.dto.request.ReviewRequest;
import com.example.WAGUWAGU_review.dto.response.ReviewResponse;
import com.example.WAGUWAGU_review.entity.Review;

import java.util.List;

public interface ReviewService {
    List<ReviewResponse> getReviewsByRestaurant(Long storeId);
    List<ReviewResponse> getReviewsByUser(Long userId);
    void addReview(ReviewRequest reviewRequest);
    void deleteReview(Long reviewId);

}
