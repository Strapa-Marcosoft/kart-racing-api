package com.marcosoft.kartracingapi.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
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
    @Column(name = "pole_position")
    private Integer polePosition;
    @Basic
    @Column(name = "best_lap")
    private Integer bestLap;
    @Basic
    @Column(name = "date")
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getPolePosition() {
        return polePosition;
    }

    public void setPolePosition(Integer polePosition) {
        this.polePosition = polePosition;
    }

    public Integer getBestLap() {
        return bestLap;
    }

    public void setBestLap(Integer bestLap) {
        this.bestLap = bestLap;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoundEntity that = (RoundEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (season != null ? !season.equals(that.season) : that.season != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (polePosition != null ? !polePosition.equals(that.polePosition) : that.polePosition != null) return false;
        if (bestLap != null ? !bestLap.equals(that.bestLap) : that.bestLap != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (season != null ? season.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (polePosition != null ? polePosition.hashCode() : 0);
        result = 31 * result + (bestLap != null ? bestLap.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
