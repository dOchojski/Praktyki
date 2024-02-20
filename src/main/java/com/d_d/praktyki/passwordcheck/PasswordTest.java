package com.d_d.praktyki.passwordcheck;

import java.util.List;
import java.util.regex.Pattern;

public class PasswordTest {
    public static void main(String[] args) {
        // check if password:
        // - contains letters
        // - contains digits
        // and match if token has at least 8 chars
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        final List passwords = List.of("A", "BCE", "Baklanaz", "Baklazan123", "bak23", "1231241241412tttt");
        passwords.forEach(password -> {
            System.out.println(
                String.format(
                    "%s - %s",
                    password,
                    pattern.matcher((String) password).matches() ? "is valid" : "is invalid"
                )
            );
        });
    }
}
