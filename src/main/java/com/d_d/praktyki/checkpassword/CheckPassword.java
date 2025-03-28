package com.d_d.praktyki.checkpassword;

public class CheckPassword {
    String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numbers = "1234567890";
    String symbols = "!@#$%^&*()[]{}|;:`~,.<>/?-_=+";
    char ch;


    public void isCorrect(String password){

        boolean isLowerCase = false;
        boolean isUpperCase = false;

        for(int i = 0 ; i < password.length();i++){
            ch = upperCase.charAt(i);
            Character.isUpperCase(ch);
        }

        if(!(password.length() >= 8)){
            System.out.println("Hasło powinno liczyć przynajmniej 8 znaków");
        }
        if(!password.contains(upperCase)){
            System.out.println("Hasło powinno zawierać duże litery");
        }
        if(!password.contains(numbers)){
            System.out.println("Hasło powinno zawierać liczby");
        }
        if(!password.contains(symbols)){
            System.out.println("Hasło powinno zawierać znaki specjalne");
        }
    }
}
