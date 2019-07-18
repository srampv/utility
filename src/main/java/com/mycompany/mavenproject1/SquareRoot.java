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
public class SquareRoot {
    
    public static void main(String[] args) {
        double t;
        double s = 7.0d/2.0d;
        do {
            System.out.println("S:--->"+s);
            t=s;
            s= (t+ (7/t))/2;
            
        }while((t-s)!=0);
    }
    
}
