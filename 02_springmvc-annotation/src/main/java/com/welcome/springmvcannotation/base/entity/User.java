package com.welcome.springmvcannotation.base.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String name;
    private int age;
    private Date birthday;
}
