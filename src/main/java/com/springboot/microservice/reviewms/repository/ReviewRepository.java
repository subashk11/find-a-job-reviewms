package com.springboot.microservice.reviewms.repository;


import com.springboot.microservice.reviewms.entity.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {

}
