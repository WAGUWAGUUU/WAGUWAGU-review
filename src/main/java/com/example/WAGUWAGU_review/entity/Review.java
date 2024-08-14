package com.example.WAGUWAGU_review.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "REVIEW")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REVIEW_ID")
    private Long id;

    @Column(name = "REVIEWER_ID")
    private Long reviewerId;

    @Column(name = "RESTAURANT_ID")
    private Long storeId;

    @Column(name = "REVIEW_RATING")
    private int rating;

    @Column(name = "REVIEW_CONTENT")
    private String content;

    @Setter
    @Column(name = "REVIEW_TIMESTAMP")
    private LocalDateTime timestamp;

    @Column(name = "REVIEWER_NAME")
    private String userName;

    @Column(name ="RES_NAME")
    private String storeName;
}
