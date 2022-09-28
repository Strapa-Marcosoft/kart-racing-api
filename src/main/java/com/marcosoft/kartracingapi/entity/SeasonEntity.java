package com.marcosoft.kartracingapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "season")
public class SeasonEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "champion")
    private Integer champion;
    @Basic
    @Column(name = "second_place")
    private Integer secondPlace;
    @Basic
    @Column(name = "third_place")
    private Integer thirdPlace;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getChampion() {
        return champion;
    }

    public void setChampion(Integer champion) {
        this.champion = champion;
    }

    public Integer getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(Integer secondPlace) {
        this.secondPlace = secondPlace;
    }

    public Integer getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(Integer thirdPlace) {
        this.thirdPlace = thirdPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeasonEntity that = (SeasonEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (champion != null ? !champion.equals(that.champion) : that.champion != null) return false;
        if (secondPlace != null ? !secondPlace.equals(that.secondPlace) : that.secondPlace != null) return false;
        if (thirdPlace != null ? !thirdPlace.equals(that.thirdPlace) : that.thirdPlace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (champion != null ? champion.hashCode() : 0);
        result = 31 * result + (secondPlace != null ? secondPlace.hashCode() : 0);
        result = 31 * result + (thirdPlace != null ? thirdPlace.hashCode() : 0);
        return result;
    }
}
