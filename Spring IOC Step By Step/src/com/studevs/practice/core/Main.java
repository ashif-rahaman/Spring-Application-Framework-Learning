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

//        Home home = PROVIDER.getBean("studentObjectWithParam");
//        System.out.println(home);
//
        Home home = (Home) PROVIDER.getBean("studentNoInfo");
        System.out.println(home);

//        home = PROVIDER.getBean("home");
//        System.out.println(home);
//        Home home = PROVIDER.getBean("studentFrList");
//        List friendList = home.getFriendList();
//        
//        Iterator it = friendList.iterator();
//        while (it.hasNext()) {            
//            System.out.println(it.next());
//        }
    }
}
