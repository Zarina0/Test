package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math {
    public String add(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            return "Error, you entered a negative number";
        }
        return String.valueOf(num1 + num2);
    }

    public String subtract(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 - num2);
    }

    public String divide(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 / num2);
        if (num1 < 0 || num2 < 0) {
            return "Error,you can't divide by zero";
        }
        return String.valueOf(num1/num2);
    }

    public String multiply(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 * num2);
    }


    public String areSymbolsIncluded(String a, String b) {
        Pattern p = Pattern.compile("[^a-s3-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(a);
        boolean c = matcher.find();

        if (c) {
            return "Error, you can't enter special characters";
        }
        return String.valueOf(a + b);
    }
}
