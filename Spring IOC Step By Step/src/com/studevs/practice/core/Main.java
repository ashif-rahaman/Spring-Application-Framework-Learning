/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.practice.core;

import com.studevs.practice.model.Home;
import com.studevs.practice.util.Beans;

/**
 *
 * @author ashif
 */
public class Main implements Beans {

    public static void main(String[] args) {

        Home home = (Home) PROVIDER.getBean("studentNoInfo");

        System.out.println(home.toString());
    }

}
