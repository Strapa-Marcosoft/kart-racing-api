package com.marcosoft.kartracingapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "round_pilot", schema = "kart_racing", catalog = "")
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
    @Column(name = "score")
    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getPilot() {
        return pilot;
    }

    public void setPilot(Integer pilot) {
        this.pilot = pilot;
    }

    public Integer getFinalPosition() {
        return finalPosition;
    }

    public void setFinalPosition(Integer finalPosition) {
        this.finalPosition = finalPosition;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoundPilotEntity that = (RoundPilotEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (round != null ? !round.equals(that.round) : that.round != null) return false;
        if (pilot != null ? !pilot.equals(that.pilot) : that.pilot != null) return false;
        if (finalPosition != null ? !finalPosition.equals(that.finalPosition) : that.finalPosition != null)
            return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (round != null ? round.hashCode() : 0);
        result = 31 * result + (pilot != null ? pilot.hashCode() : 0);
        result = 31 * result + (finalPosition != null ? finalPosition.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }
}
