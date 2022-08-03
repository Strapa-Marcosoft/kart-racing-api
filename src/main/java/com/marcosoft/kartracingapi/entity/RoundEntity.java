package com.marcosoft.kartracingapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "round", schema = "kart_racing", catalog = "")
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
