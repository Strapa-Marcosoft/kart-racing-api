package com.marcosoft.kartracingapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pilot")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
}
