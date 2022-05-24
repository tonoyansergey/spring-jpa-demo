package com.springdatajpa.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="MOVIES")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MOVIE_ID")
    private Long movieId;

    @Column(name="TITLE")
    private String title;

    @Column(name="YEAR")
    private String year;

    @Column(name="GENRE")
    private String genre;

    @Column(name="RUNTIME")
    private Long runtime; //expressed in minutes

    @OneToMany(mappedBy="movie",targetEntity=Review.class)
    private Collection reviews;
}
