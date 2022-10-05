package com.marcosoft.kartracingapi.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Builder
@Table(name = "round")
public class RoundEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "season")
    private Integer season;
    @Basic
    @Column(name = "location")
    private Integer location;
    @Basic
    @Column(name = "date")
    private Date date;
}
