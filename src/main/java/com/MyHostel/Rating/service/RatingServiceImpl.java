package com.MyHostel.Rating.service;

import com.MyHostel.Rating.entity.Rating;
import com.MyHostel.Rating.utils.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{

    @Autowired
   private RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(int userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating>  getRatingByHostelId(int hostelId) {
        return ratingRepository.findByHostelId(hostelId);
    }
}
