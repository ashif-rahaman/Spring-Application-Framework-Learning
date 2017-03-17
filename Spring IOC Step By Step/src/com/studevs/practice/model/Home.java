/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.practice.model;

/**
 *
 * @author ashif
 */
public class Home {

    private String name;
    private int age;
    private float cgpa;
    private String address;

    
    /**
     * Constructors with different parameters
     */
    
    
    public Home() {
        
    }

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


    
    /**
     * toString Implemented
     * @return 
     */
    
    @Override
    public String toString() {
        return "Home{" + "name=" + name + ", age=" + age + ", cgpa=" + cgpa + ", address=" + address + '}';
    }
    
}
