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
public class BitTest {
    
    public static int getBit(int num, int bit){
        return num & (1 << bit);
    }
    
    public static int setBit(int num, int bit){
        return num | (1 << bit);
    }
    
    public static int reset(int num, int bit){
        int mask =~(num << bit);
        return num & mask;
    }
    
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(50));
        System.out.println(Integer.toBinaryString(50 << 2));
        int val = 100 | 50;
        System.out.println(Integer.toBinaryString(200 | 50));
        String X="test1";
        System.out.println(X.substring(0,X.length()));
    }
}
