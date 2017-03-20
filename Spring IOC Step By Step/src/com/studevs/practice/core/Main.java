/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.practice.core;

import com.studevs.practice.util.Beans;

/**
 *
 * @author ashif
 */
public class Main implements Beans {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        System.out.println((((a << 1) << 1) << 1) == (a << 3));
        System.out.println((a << 3) == (a * 2 * 2 * 2));
        System.out.println((a << 2) + (a << 1) + a);

        System.out.println(b == (b >> 1) << 1);
    }
}
