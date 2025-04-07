package com.d_d.praktyki.Calculator;

public class Calculator {
    public float add(float a, float b, float c){
        return a+b+c;
    }
    public float add(float a, float b){
        return add(a,b,0);
    }
    public float substract(float a, float b, float c){
        return a-b-c;
    }
    public float substract(float a, float b){
        return substract(a,b,0);
    }
}
