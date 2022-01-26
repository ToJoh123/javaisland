package com.company;

class StringMetoder {
    static boolean ärPalindrom(String s) {
        return s.equals(baklänges(s));
    }

    static String baklänges(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--)
            r = r + s.charAt(i);
        return r;
    }
}