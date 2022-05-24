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
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="REVIEWERS")
public class Reviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="REVIEWER_ID")
    private Long reviewerId;

    @Column(name="USERNAME")
    private String userName;

    @Column(columnDefinition = "date", name="DATE_JOINED")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateJoined;

    @OneToMany(mappedBy="reviewer", targetEntity=Review.class)
    private Collection reviews;
}
