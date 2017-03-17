/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.practice.core;

import com.studevs.practice.model.Home;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ashif
 */
public class Main {
    
    
    public static ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
    
    public static void main(String[] args) {
        
        Home home = (Home)context.getBean("studentNoInfo");
        
        System.out.println(home.toString());
    }
    
}
