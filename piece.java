package org.example;

import java.util.List;

abstract class Piece {
    protected Position position;

    public Piece(Position position) {
        this.position = position;
    }

    public abstract List<Position> getValidMoves();
}