package com.springdatajpa.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="REVIEWS")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="REVIEW_ID")
    private long reviewId;

    @Column(name="REVIEW_TEXT")
    private String reviewText;

    @Column(name="MOVIE_ID",insertable = false,updatable = false)
    private long movieId;

    @Column(name="REVIEWER_ID",insertable = false,updatable = false)
    private long reviewerId;

    @Column(columnDefinition = "date", name="LAST_MODIFIED")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lastModified;

    @ManyToOne
    @JoinColumn(name="MOVIE_ID",referencedColumnName="MOVIE_ID")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="REVIEWER_ID",referencedColumnName="REVIEWER_ID")
    private Reviewer reviewer;
}
