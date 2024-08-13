package com.example.WAGUWAGU_review.dto.response;

import com.example.WAGUWAGU_review.entity.Review;

import java.time.LocalDateTime;

public record ReviewResponse(
        String userName, String content, LocalDateTime timestamp, int rating
) {
    public static ReviewResponse fromReview(Review review) {
    return new ReviewResponse(review.getUserName(), review.getContent(), review.getTimestamp(),review.getRating());
    }
}
