package com.d_d.praktyki.PasswordCheck;

import java.util.regex.Pattern;

public class PasswordCheck {
    private Pattern passwordPattern;
    public PasswordCheck() {

        final String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        setPattern(regex);
    }
    public PasswordCheck(final String regex) {
        setPattern(regex);
    }
    public boolean isValid(String password) {
        return passwordPattern.matcher(password).matches();
    }
    private void setPattern( String regex) {
        passwordPattern = Pattern.compile(regex);
    }
}
