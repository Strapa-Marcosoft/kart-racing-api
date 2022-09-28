package com.marcosoft.kartracingapi.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
@Table(name = "round_pilot")
public class RoundPilotEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "round")
    private Integer round;
    @Basic
    @Column(name = "pilot")
    private Integer pilot;
    @Basic
    @Column(name = "final_position")
    private Integer finalPosition;
    @Basic
    @Column(name = "pole_position")
    private Boolean polePosition;
    @Basic
    @Column(name = "best_lap")
    private Boolean bestLap;
    @Basic
    @Column(name = "score")
    @Builder.Default
    private Integer score = 1;

    public void incrementScore() {
        this.score++;
    }

    public void incrementScore(int scoreToAdd) {
        this.score += scoreToAdd;
    }
}
