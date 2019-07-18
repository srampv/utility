/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Optional;

/**
 *
 * @author VenkPi
 */
public class OrElseGet {

//    public static void main(String[] args) {
//        validate(Optional.empty());
//        validate(Optional.of("VENKATA"));
//        
//    }
    public Optional<String> findMyPhone(int phoneId) {
        return phoneId == 10
                ? Optional.of("MyCheapPhone")
                : Optional.empty();
    }

    public String buyNewExpensivePhone() {
        System.out.println("\tGoing to a very far store to buy a new expensive phone");
        return "NewExpensivePhone";
    }

    public static void main(String[] args) {
        OrElseGet test = new OrElseGet();
        String phone;
        System.out.println("------------- Scenario 1 - orElse() --------------------");
        System.out.println("  1.1. Optional.isPresent() == true");
        phone = test.findMyPhone(10).orElse(test.buyNewExpensivePhone());
        System.out.println("\tUsed phone: " + phone + "\n");

        System.out.println("  1.2. Optional.isPresent() == false");
        phone = test.findMyPhone(-1).orElse(test.buyNewExpensivePhone());
        System.out.println("\tUsed phone: " + phone + "\n");

        System.out.println("------------- Scenario 2 - orElseGet() --------------------");
        System.out.println("  2.1. Optional.isPresent() == true");
        // Can be written as test::buyNewExpensivePhone
        phone = test.findMyPhone(10).orElseGet(() -> test.buyNewExpensivePhone());
        System.out.println("\tUsed phone: " + phone + "\n");

        System.out.println("  2.2. Optional.isPresent() == false");
        phone = test.findMyPhone(-1).orElseGet(() -> test.buyNewExpensivePhone());
        System.out.println("\tUsed phone: " + phone + "\n");
    }
}
