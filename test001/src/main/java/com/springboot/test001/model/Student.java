package com.springboot.test001.model;

public class Student {
    private Integer id;

    private String name;

    private Integer age;

    private String passwod;

    public Student(Integer id, String name, Integer age, String passwod) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.passwod = passwod;
    }

    public Student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPasswod() {
        return passwod;
    }

    public void setPasswod(String passwod) {
        this.passwod = passwod == null ? null : passwod.trim();
    }
}