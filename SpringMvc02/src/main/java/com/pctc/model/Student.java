package com.pctc.model;

public class Student {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private Integer age;


    private Address address;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "Student [id=" + id + ", username=" + username + ", password="
                + password + ", email=" + email + ", age=" + age + ", address="
                + address + "]";
    }


}
