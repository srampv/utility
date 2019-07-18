/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author VenkPi
 */
public class TestException {

    public static void main(String[] args) {
        try {
            int j = 1 / 0;
        } catch (Exception e) {
//            throw new RuntimeException("hey you are caught up");
            return;
//            System.exit(-1);
        } 
            doMe();
        
    }

    private static void doMe() {
        System.out.println("You are not");
    }

}
