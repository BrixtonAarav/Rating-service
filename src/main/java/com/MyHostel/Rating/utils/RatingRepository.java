package com.MyHostel.Rating.utils;

import com.MyHostel.Rating.entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<Rating, Integer> {

    List<Rating> findByUserId(int userId);
    List<Rating> findByHostelId(int hostelId);
}
