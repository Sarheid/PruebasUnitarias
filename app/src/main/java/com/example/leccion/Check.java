package com.example.leccion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {

    public static boolean validateEmpty(String value) {
        if (value.isEmpty()) {
            return true;
        }
        return false;

    }


    public static boolean validateEmail(String value) {


        String regx = "^[A-Za-z0-9+_.-]+@(.+)$";
        //String reg = "^(([^<>()[\\]\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@(([^<>()[\\]\\.,;:\\s@\\\"]+\\.)+[^<>()[\\]\\.,;:\\s@\\\"]{2,})$/i";
        //Regular Expression for email
        //String regx = "e(\\d){10}@live.uleam.edu.ec";
        //Compile regular expression to get the pattern
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(value);


        if (matcher.matches()) {
            return true;
        }
        return false;


    }

    public static boolean validateUser(String email, String password) {
        String emailBD = "venomoushit@gmail.com";
        String passwordBD = "123456";


        if (email.equals(emailBD) && password.equals(passwordBD)) {
            return true;
        }
        return false;


    }
}
