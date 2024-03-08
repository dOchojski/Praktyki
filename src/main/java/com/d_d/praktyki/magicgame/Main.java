package com.d_d.praktyki.magicgame;

import com.d_d.praktyki.magicgame.elements.Dot;
import com.d_d.praktyki.magicgame.elements.DotController;
import com.d_d.praktyki.magicgame.graphics.BorderedDisplay;
import com.d_d.praktyki.magicgame.graphics.Display;

import java.util.Scanner;

public class Main {
    private static DotController controller;

    private static BorderedDisplay gameDisplay = new BorderedDisplay(20, 10);

    private static BorderedDisplay tasksDisplay = new BorderedDisplay(20, 3);

    private static GameLogic gameLogic;

    private static final Scanner scanner = new Scanner(System.in);

    private static boolean isRunning = true;

    public static void main(String[] args) {
        onSetup();
        while (isRunning) {
            onGameLoop();
        }
    }

    private static void onUpdate() {
        gameLogic.onUpdate();
    }

    private static void onInput() {
        String input = scanner.next();
        controller.handleInput(input);
    }

    private static void onRender() {
        gameDisplay.displayFrame();
        tasksDisplay.displayFrame();
    }

    private static void onSetup() {
        Dot character = new Dot();
        gameDisplay.objects.add(character);
        controller = new DotController(character);
        gameLogic = new GameLogic(gameDisplay, tasksDisplay, controller);
        gameLogic.startRound();
    }

    private static void onGameLoop() {
        onUpdate();
        onRender();
        onInput();
    }
}
