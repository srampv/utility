/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import seo.com.Exception_Exception;
import seo.com.IOException_Exception;
import seo.com.TestWSA;
import seo.com.TestWSB;

/**
 *
 * @author VenkPi
 */
public class TestWSClient {
    
    public static void main(String[] args) throws Exception_Exception, IOException_Exception {
        TestWSB ws=new TestWSB();
        TestWSA wa=ws.getTestWSPort();
        System.out.println(wa.execute("dir"));
    }
    
}
