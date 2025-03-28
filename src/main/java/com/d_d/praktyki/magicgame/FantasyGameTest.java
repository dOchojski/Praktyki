package com.d_d.praktyki.magicgame;

public class FantasyGameTest {
    public static void main(String[] args) {
        FantasyGame fantasyGame = new FantasyGame(3, 3, "Gracz 1", 10);
        fantasyGame.makeMove(0, 0);
        fantasyGame.makeMove(1, 1);
        fantasyGame.makeMove(2, 2);
        fantasyGame.suggestPath();
    }
}
