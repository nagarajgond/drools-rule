package com.test.drl;

import java.math.BigInteger;

public class BasicIpUtils {
    public static boolean equals(String ip1, String ip2) {
        return ip1.compareTo(ip2) == 0;
    }
    public static boolean between(String fromIp, String toIp, String ip) {
        return fromIp.contains(toIp) && fromIp.equals(ip);
    }

}
