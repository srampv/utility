/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seo.com;

/**
 *
 * @author VenkPi
 */
public class ParamTest {
    
    public static void main(String[] args) {
        System.getProperties().forEach((c,d) -> System.out.println(c+":"+d));
//        System.getenv().forEach((u,x)->System.out.println(u+":"+x));
        System.out.println(System.getProperty("sun.java.command").split("\\ ")[1].substring(2).split("\\=")[1]);
    }
    
}
