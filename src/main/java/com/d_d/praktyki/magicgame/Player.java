package com.d_d.praktyki.magicgame;

class Player {
    private String name;
    private int moves;

    public Player(String name, int moves) {
        this.name = name;
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public int getMoves() {
        return moves;
    }

    public void decrementMoves() {
        moves--;
    }
}
