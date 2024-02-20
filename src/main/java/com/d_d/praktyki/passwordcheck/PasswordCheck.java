package com.d_d.praktyki.passwordcheck;

import java.util.regex.Pattern;

public class PasswordCheck {
    private Pattern passwordPattern;

    /**
     * Sets default regex pattern: Check if password contains letters,
     * digits and has at least 8 characters.
     */
    public PasswordCheck() {
        final String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        setPattern(regex);
    }
    /**
     * Sets custom regex pattern.
     * @param regex regular expression to be used in validation.
     */
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
