package com.springboot.microservice.reviewms.services;


import com.springboot.microservice.reviewms.entity.Review;

import java.util.List;

public interface ReviewService {

    Review getReviewById(String companyId, String reviewId);
    List<Review> getAllReviewsOfCompany(String companyId);
    boolean deleteReview(String companyId, String reviewId);
    boolean updateReview(String companyId, String reviewId, Review updatedReview);
    boolean createReview(String companyId, Review review);
}
