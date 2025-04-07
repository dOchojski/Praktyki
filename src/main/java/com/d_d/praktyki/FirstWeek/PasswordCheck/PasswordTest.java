package com.d_d.praktyki.PasswordCheck;

import java.util.List;
import java.util.regex.Pattern;
public class PasswordTest {
    public static void main(String[] args) {

        final String reg = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\dd]{8,}$";
        Pattern pat = Pattern.compile(reg);
        PasswordCheck check = new PasswordCheck();
        List hasla = List.of("H2dwswj", "Koteczki", "7737772", "98HhJjkLK","KOTKI282","kotki3323");
        hasla.forEach(password -> {
            if (pat.matcher((String) password).matches()) System.out.println(
                    String.format(
                            "%s - %s",
                            password,
                            "is valid",
                            check.isValid((String) password) ? "is valid" : "is invalid"
                    )
            );
            else System.out.println(
                    String.format(
                            "%s - %s",
                            password,
                            "is invalid",
                            check.isValid((String) password) ? "is valid" : "is invalid"
                    )
            );
        });
    }
}