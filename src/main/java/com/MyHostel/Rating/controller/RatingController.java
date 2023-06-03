package com.MyHostel.Rating.controller;


import com.MyHostel.Rating.entity.Rating;
import com.MyHostel.Rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/new")
    public ResponseEntity<Rating> createNewRating(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
    }

    @GetMapping("allrating")
    public ResponseEntity<List<Rating>> getAllRating(){
        return ResponseEntity.ok(ratingService.getAllRating());
    }

    @GetMapping("users/{userId}")
    public ResponseEntity<List<Rating>> getByUserId(@PathVariable int userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("hostel/{hostelId}")
    public ResponseEntity<List<Rating>> getByHostelId(@PathVariable int hostelId){
        return ResponseEntity.ok(ratingService.getRatingByHostelId(hostelId));
    }
}
