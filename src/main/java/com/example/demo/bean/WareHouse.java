package com.example.demo.bean;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="warehouse")
@Data
public class WareHouse {
    @Id
    @GeneratedValue
    @Column(name="w_id")
    private int id;

    @Column(name="w_name")
    private String name;

    @Column(name="w_street_1")
    private String street_1;

    @Column(name="w_street_2")
    private String street_2;

    @Column(name="w_city")
    private String city;

    @Column(name="w_zip")
    private String zip;

    @Column(name="w_tax")
    private String tax;

    @Column(name="w_ytd")
    private String ytd;

}
