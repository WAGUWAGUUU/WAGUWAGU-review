package com.example.WAGUWAGU_review.controller;

import com.example.WAGUWAGU_review.dto.request.ReviewRequest;
import com.example.WAGUWAGU_review.dto.response.ReviewResponse;
import com.example.WAGUWAGU_review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    private final ReviewService reviewService;
    private final Logger logger = LoggerFactory.getLogger(ReviewController.class);
    @GetMapping("store/{storeId}")
    public List<ReviewResponse> getReviewsByRestaurant(@PathVariable Long storeId) {
        return reviewService.getReviewsByRestaurant(storeId);
    }

    @GetMapping("myReview/{userId}")
    public List<ReviewResponse> getReviewsByReviewerId(@PathVariable Long userId) {
        return reviewService.getReviewsByUser(userId);
    }

    @PostMapping
    public void createReview(@RequestBody ReviewRequest reviewRequest) {
        logger.info(reviewRequest.toString());
        reviewService.addReview(reviewRequest);

    }

    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        reviewService.deleteReview(reviewId);
    }



}
