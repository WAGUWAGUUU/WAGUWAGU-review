package com.example.WAGUWAGU_review.dto.request;

import com.example.WAGUWAGU_review.entity.Review;
import lombok.Setter;

import java.time.LocalDateTime;

public record ReviewRequest(
    Long reviewerId, String userName, String content,Long storeId, int rating, String storeName
) {
        public Review toEntity() {
        return Review.builder()
                .reviewerId(reviewerId)
                .content(content)
                .userName(userName)
                .timestamp(LocalDateTime.now())
                .storeId(storeId)
                .rating(rating)
                .storeName(storeName)
                .build();
    }
}
