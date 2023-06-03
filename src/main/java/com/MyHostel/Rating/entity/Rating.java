package com.MyHostel.Rating.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user_rating")
public class Rating {

    @Id
    private String ratingId;
    private int userId;
    private int hostelId;
    private int rating;
    private String feedback;

    public Rating(String ratingId, int userId, int hostelId, int rating, String feedback) {
        this.ratingId = ratingId;
        this.userId = userId;
        this.hostelId = hostelId;
        this.rating = rating;
        this.feedback = feedback;
    }

    public Rating() {
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHostelId() {
        return hostelId;
    }

    public void setHostelId(int hostelId) {
        this.hostelId = hostelId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId=" + ratingId +
                ", userId=" + userId +
                ", hostelId=" + hostelId +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
