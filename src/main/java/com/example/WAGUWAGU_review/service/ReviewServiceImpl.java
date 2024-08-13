package com.example.WAGUWAGU_review.service;

import com.example.WAGUWAGU_review.dto.request.ReviewRequest;
import com.example.WAGUWAGU_review.dto.response.ReviewResponse;
import com.example.WAGUWAGU_review.entity.Review;
import com.example.WAGUWAGU_review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Override
    public List<ReviewResponse> getReviewsByRestaurant(Long storeId) {
        List<Review> byRestaurantId = reviewRepository.findByStoreId(storeId);

        return  byRestaurantId.stream().map(ReviewResponse::fromReview).toList();
    }

    @Override
    public List<ReviewResponse> getReviewsByUser(Long userId) {
        List<Review> byReviewerId = reviewRepository.findByReviewerId(userId);

        return byReviewerId.stream().map(ReviewResponse::fromReview).toList();
    }

    @Override
    public void addReview(ReviewRequest reviewRequest) {
        Review review = reviewRequest.toEntity();

        reviewRepository.save(review);

    }

    @Override
    public void deleteReview(Long reviewId) {
        Optional<Review> byId = reviewRepository.findById(reviewId);
        byId.ifPresent(reviewRepository::delete);
        throw  new IllegalArgumentException("Cannot perform deletion:Review not found");
    }

}
