package com.d_d.praktyki.passwordcheck;

import java.util.regex.Pattern;

public class PasswordCheck {
    private Pattern passwordPattern;
    public PasswordCheck() {
        // check if password:
        // - contains letters
        // - contains digits
        // and match if token has at least 8 chars
        final String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        setPattern(regex);
    }
    public PasswordCheck(final String regex) {
        setPattern(regex);
    }
    public boolean isValid(String password) {
        return passwordPattern.matcher(password).matches();
    }
    private void setPattern(final String regex) {
        passwordPattern = Pattern.compile(regex);
    }
}
