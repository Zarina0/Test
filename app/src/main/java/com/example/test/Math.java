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
    }

    public String multiply(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 * num2);

    }

    public String dividedByZero(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            return "this number cannot be divisible by zero";

        }
        return "Error,you can't divide by zero";


    }


    public String areSymbolsIncluded(String a, String b) {
        Pattern p = Pattern.compile("[^a-s3-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p.matcher(a);
        boolean c = m1.find();


        if (c) {
            return "Error, you can't enter special characters";

        }
        return String.valueOf(a+b);



    }

}