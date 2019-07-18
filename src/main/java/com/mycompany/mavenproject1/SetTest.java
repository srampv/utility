/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author VenkPi
 */
public class SetTest {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        String NETWORK_ID = "WMABC";
        s.add("VENKATA");
        s.add("PILAKA");
        s.add("TEST");
        s.add("WMM*");
        s.add("KMM*");
        s.add("MMM*");
        s.add("TCC*");
        s.add("XYZ*");
        s.add("*");
        s.add("null");
//        boolean val=s.stream().filter(n -> NETWORK_ID.contains(n)).findFirst().isPresent();
//        System.out.println("VAL:-->"+val);
        ProviderNetworkAccessPoint pnap = new ProviderNetworkAccessPoint();
        ProviderNetworkKey key = new ProviderNetworkKey();
        key.setNetworkId("XYZSS");
        pnap.setProviderNetworkKey(key);
//        System.out.println(isBatchLocatorQ5(pnap, s));
//        System.out.println(NETWORK_ID.matches("WMM[a-zA-Z][a-zA-Z]"));
//        System.out.println(NETWORK_ID.substring(0, NETWORK_ID.length() - 1));
        System.out.println(hasQ5NetworkId(s, NETWORK_ID));
        System.out.println(s.stream().map(String::hashCode));

    }

    private static boolean isBatchLocatorQ5(ProviderNetworkAccessPoint pnap, Set<String> networkIds) {
        return getNetworkId(pnap).filter(n -> hasQ5NetworkId(networkIds, n)).isPresent();
    }

    private static boolean hasQ5NetworkId(Set<String> networkIds, final String networkId) {

        Iterator<String> values= networkIds.iterator();
        boolean found=false;
        while(values.hasNext()) {
            String n = values.next().trim();
            if (n.endsWith("*")) {
                StringBuilder regex = new StringBuilder();
                regex.append(n.toUpperCase().substring(0, n.length() - 1)).append("[A-Z][A-Z]");
                if(networkId.toUpperCase().matches(regex.toString())){
                    found=true;
                    break;
                }
            } else {
                if(networkId.toUpperCase().equalsIgnoreCase(n.toUpperCase().trim())){
                    found=true;
                    break;
                }
            }
        }
        return found;

    }

    private static Optional<String> getNetworkId(ProviderNetworkAccessPoint pnap) {
        return (pnap == null || pnap.getProviderNetworkKey() == null)
                ? Optional.empty()
                : Optional.ofNullable(pnap.getProviderNetworkKey().getNetworkId());
    }

}

class ProviderNetworkAccessPoint {

    ProviderNetworkKey providerNetworkKey;

    public ProviderNetworkKey getProviderNetworkKey() {
        return providerNetworkKey;
    }

    public void setProviderNetworkKey(ProviderNetworkKey providernetworkKey) {
        this.providerNetworkKey = providernetworkKey;
    }

}

class ProviderNetworkKey {

    String networkId;

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

}
