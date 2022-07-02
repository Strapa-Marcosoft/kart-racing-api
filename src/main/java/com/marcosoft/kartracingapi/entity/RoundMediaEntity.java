package com.marcosoft.kartracingapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "round_media", schema = "kart_racing", catalog = "")
public class RoundMediaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "round")
    private Integer round;
    @Basic
    @Column(name = "media")
    private String media;

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

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoundMediaEntity that = (RoundMediaEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (round != null ? !round.equals(that.round) : that.round != null) return false;
        if (media != null ? !media.equals(that.media) : that.media != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (round != null ? round.hashCode() : 0);
        result = 31 * result + (media != null ? media.hashCode() : 0);
        return result;
    }
}
