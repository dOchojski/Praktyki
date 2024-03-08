package com.d_d.praktyki.passwordcheck;

import java.util.List;
import java.util.regex.Pattern;

public class PasswordTest {
    public static void main(String[] args) {
        // check if password:
        // - contains letters
        // - contains digits
        // and match if token has at least 8 chars
        PasswordCheck checker = new PasswordCheck();
        final List passwords = List.of("A", "BCE", "Baklanaz", "Baklazan123", "bak23", "1231241241412tttt");
        passwords.forEach(password -> {
            System.out.println(
                String.format(
                    "%s - %s",
                    password,
                    checker.isValid((String) password) ? "is valid" : "is invalid"
                )
            );
        });
    }
}
