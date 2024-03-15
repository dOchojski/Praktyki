package com.d_d.praktyki.magicgame;

public class FantasyGame {
    private GameBoard gameBoard;
    private Player player;

    public FantasyGame(int rows, int cols, String playerName, int moves) {
        this.gameBoard = new GameBoard(rows, cols);
        this.player = new Player(playerName, moves);
    }
    public void makeMove(int row, int col) {
        if (player.getMoves() > 0) {
            gameBoard.moveAndCollect(player, row, col);
            gameBoard.displayBoard();
        } else {
            System.out.println("Brak ruchów. Koniec Gry.");
        }
    }
    public void suggestPath() {
        System.out.println("Sugerowana Ścieżka:");
        // TODO: Implementacja algorytmu
    }
}