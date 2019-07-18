/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seo.com;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author VenkPi
 */
public class UnicodeTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
         System.out.println (toHex("ఈ".getBytes("UTF-8"))); //prints E0B088
    }
    //not optimized

    static String toHex(byte[] b) {
        String s = "";
        for (int i = 0; i < b.length; ++i) {
            s += String.format("%02X", b[i] & 0xff);
        }
        return s;
    }

   
    
}
