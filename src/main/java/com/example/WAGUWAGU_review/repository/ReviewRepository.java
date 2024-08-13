package com.example.WAGUWAGU_review.repository;

import com.example.WAGUWAGU_review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByStoreId(Long storeId);
    List<Review> findByReviewerId(Long userId);
}
