package com.company;

class StringMetoder {
    static boolean isPalindrom(String s) {
        return s.equals(backWards(s));
    }

    static String backWards(String s) {
        StringBuilder r = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            r.append(s.charAt(i));
        return r.toString();
    }
}