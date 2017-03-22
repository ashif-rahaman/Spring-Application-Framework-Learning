/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.practice.model;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author ashif
 */
public class Home {

    private String name;
    private int age;
    private float cgpa;
    private String address;

    private List<String> friendList;

    /**
     * Constructors with different parameters
     */
    /**
     * Constructor No Parameter
     */
    public Home() {

    }

    /**
     *
     * @param name [Type - String]
     * @param age [Type - int]
     */
    public Home(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Home(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Home(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Home(String name, int age, float cgpa, String address) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.address = address;
    }

    /**
     * Getters and Setters
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<String> friendList) {
        this.friendList = friendList;
    }

    /**
     * toString Implemented
     *
     * @return
     */
    @Override
    public String toString() {
        return "Home{" + "name=" + name + ", age=" + age + ", cgpa=" + cgpa + ", address=" + address + '}';
    }

    @PostConstruct
    void doInitialize() {
        
        System.out.println("Object Initialized");
    }

    @PreDestroy
    void doDestroy() {

        System.out.println("Object is destroying");
    }

}
