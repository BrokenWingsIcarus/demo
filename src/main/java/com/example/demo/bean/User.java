package com.example.demo.bean;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="sec_user")
@Data
public class User {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
    private String name;
    private String password;
    private Integer division_id;
    private String email;
    private String gender;

    private String create_by;

    private String create_item;

    private String update_by;

    private String update_time;

    private String disabled;

    private String theme;

    private Integer isLdap;

}
