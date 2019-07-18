/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author VenkPi
 */
public class DateTest {
    
    public static void main(String[] args) {
        LocalDateTimeStringConverter l =new LocalDateTimeStringConverter();
        LocalDateTime ldt=l.fromString("2019-06-20");
         System.out.println(DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(ldt));
    }
    
}
