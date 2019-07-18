/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 *
 * @author VenkPi
 */
public class MapTest {

    public static void main(String[] args) {
        Claim c = new Claim();
        Optional<Claims> claims = Optional.of(new Claims());
        Function<Integer, Integer> f1 = (x) -> (x - 5);
        Function<Integer, Integer> f2 = (x) -> (x * 5);
        ArrayList list = new ArrayList<>();
        System.out.println(claims.map(List::isEmpty).orElse(false));
        System.out.println(f1.andThen(f2).apply(50));
        System.out.println(f1.compose(f2).apply(50));
//        Myfunction<Integer,Integer> mf = (y) ->(y*9);
    }

}

class Claims extends LinkedList<Claim> {

    Claim claim;

    public Claims() {

    }

    public Claims(Claim claim) {
        this.claim = claim;
        this.add(claim);
    }

}

class Claim {

    int id;
    String val;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

}

class Myfunction<T, R> implements Function<T, R> {

    T t;
    R r;

    @Override
    public R apply(T t) {
        return r;
    }

    

}
