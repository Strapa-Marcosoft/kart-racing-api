package com.marcosoft.kartracingapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "season_score")
public class SeasonScoreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "pilot")
    private Integer pilot;
    @Basic
    @Column(name = "score")
    private Integer score;
    @Basic
    @Column(name = "season")
    private Integer season;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPilot() {
        return pilot;
    }

    public void setPilot(Integer pilot) {
        this.pilot = pilot;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeasonScoreEntity that = (SeasonScoreEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pilot != null ? !pilot.equals(that.pilot) : that.pilot != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (season != null ? !season.equals(that.season) : that.season != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pilot != null ? pilot.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (season != null ? season.hashCode() : 0);
        return result;
    }
}
