package com.d_d.praktyki.conditionalstatements;

import java.util.Scanner;

public class ConditionalTest {
    public static void main(String[] args) {
        ValueCheck check = new ValueCheck();
        System.out.println("Wartość: "+check.getFormattedValue());

        Display display = new Display(20, 8);
        Dot dot = new Dot();
        display.objects.add(dot);
        DotController controller = new DotController(dot);

        Scanner reader = new Scanner(System.in);

        // primitive game loop
        while (true) {
            String input = reader.next();
            //key event handling
            controller.handleInput(input);

            //rendering
            display.displayFrame();
        }
    }
}
