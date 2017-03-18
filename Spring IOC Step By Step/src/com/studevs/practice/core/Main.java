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
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a << 1));
        System.out.println(a << 1);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b >> 1));
        System.out.println(b >> 1);
        System.out.println("\n\n\n\n");

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a & 0));
        System.out.println(Integer.toBinaryString(~a));
    }
}
