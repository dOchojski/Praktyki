package com.d_d.praktyki.conditionalstatements;

public class ConditionalTest {
    public static void main(String[] args) {
        ValueCheck check = new ValueCheck();
        System.out.println("Wartość: "+check.getFormattedValue());

        Display display = new Display(20, 8);
        Dot dot = new Dot();
        display.objects.add(dot);
        display.displayFrame();
    }
}
