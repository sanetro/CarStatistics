package com.sanetro.app.carStatisticsGUI.model;

public class User {
    private String username;
    private String password; // should be hashed, but it's not main point for this application
    private String surname;
    private String email;
    private String name;
    private Integer age;

    public User() {
    }

    public User(String username, String password, String surname, String email, String name, Integer age) {
        this.username = username;
        this.password = password;
        this.surname = surname;
        this.email = email;
        this.name = name;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
