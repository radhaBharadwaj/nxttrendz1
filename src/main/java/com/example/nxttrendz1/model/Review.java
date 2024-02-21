package com.example.nxttrendz1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewId")
    private int reviewId;
    @Column(name = "reviewcontent")
    private String reviewContent;
    @Column(name = "rating")
    private int rating;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    public Review() {
    }

    public Review(int reviewId, String reviewContent, int rating, Product product) {
        this.reviewId = reviewId;
        this.reviewContent = reviewContent;
        this.rating = rating;
        this.product = product;
    }

    public int getReviewId() {
        return this.reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewContent() {
        return this.reviewContent;
    }

    public void setReviewId(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
