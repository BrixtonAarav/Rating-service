package com.MyHostel.Rating.service;

import com.MyHostel.Rating.entity.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating createRating(Rating rating);

    //get all rating
    List<Rating> getAllRating();

    //get by userid
    List<Rating> getRatingByUserId(int userId);

    //get by hostelid
    List<Rating> getRatingByHostelId(int HostelId);
}
