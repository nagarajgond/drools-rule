package com.test.drl;

public class StringUtils {
    public static boolean isContaining(String text, String key) {
        if (text == null || key == null) {
            return false;
        }
        return text.contains(key);
    }
}
