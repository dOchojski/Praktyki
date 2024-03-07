package com.d_d.praktyki.magicgame;

import com.d_d.praktyki.magicgame.elements.Dot;
import com.d_d.praktyki.magicgame.elements.DotController;
import com.d_d.praktyki.magicgame.graphics.Display;

import java.util.Scanner;

public class Main {
    private static Display gameDisplay = new Display(50, 20);

    private static DotController controller;

    private static final Scanner scanner = new Scanner(System.in);

    private static boolean isRunning = true;

    public static void main(String[] args) {
        onSetup();
        while (isRunning) {
            onGameLoop();
        }
    }

    private static void onUpdate() {
        String input = scanner.next();
        controller.handleInput(input);
    }

    private static void onRender() {
        gameDisplay.displayFrame();
    }

    private static void onSetup() {
        Dot character = new Dot();
        gameDisplay.objects.add(character);
        controller = new DotController(character);
    }

    private static void onGameLoop() {
        onRender();
        onUpdate();
    }
}
