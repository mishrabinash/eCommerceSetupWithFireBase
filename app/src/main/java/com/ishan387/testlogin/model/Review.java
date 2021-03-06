package com.ishan387.testlogin.model;

import java.util.Date;

/**
 * Created by ishan on 01-11-2017.
 */

public class Review {

    String userName;
    float rating;
    String review;

    Date date;

    public Review() {
    }

    public String getUserName() {
        return userName;
    }

    public float getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public Date getDate() {
        return date;
    }

    public Review(String userName, float rating, String review, Date date) {
        this.userName = userName;
        this.rating = rating;
        this.review = review;
        this.date = date;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
