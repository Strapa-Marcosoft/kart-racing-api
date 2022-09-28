package com.marcosoft.kartracingapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "pilot")
public class PilotEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "full_name")
    private String fullName;
    @Basic
    @Column(name = "alias")
    private String alias;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "adm")
    private Byte adm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PilotEntity that = (PilotEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        return result;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getAdm() {
        return adm;
    }

    public void setAdm(Byte adm) {
        this.adm = adm;
    }
}
