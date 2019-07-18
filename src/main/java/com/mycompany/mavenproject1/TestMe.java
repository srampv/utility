/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

/**
 *
 * @author venkpi
 */
public class TestMe {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String str = "1305998791";
        byte b[] = str.getBytes();
        for (byte b1 : b) {
            System.out.print(Integer.toHexString(b1));
        }
        System.out.println(new String(intToLittleEndian(2)));
        String data[] = {null, "VENK", null, null, null};
//        Optional<String> st=Arrays.asList(data).stream().filter(p -> p.equalsIgnoreCase("VEN")).findAny().filter(n ->n.equalsIgnoreCase("VEN"));
        boolean bool = Optional.ofNullable(null).filter(n -> n.equals("MARCH")).isPresent();
        boolean bool1 = Optional.empty().filter(n -> n.equals("MARCH")).isPresent();
        System.out.println(bool + ":" + bool1);

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        String checksum = new BigInteger(1, messageDigest.digest(str.getBytes())).toString(16);
        System.out.println(checksum);
    }

    private static byte[] intToLittleEndian(long numero) {
        byte[] b = new byte[4];
        b[0] = (byte) (numero & 0xFF);
        b[1] = (byte) ((numero >> 8) & 0xFF);
        b[2] = (byte) ((numero >> 16) & 0xFF);
        b[3] = (byte) ((numero >> 24) & 0xFF);
        return b;
    }

}
