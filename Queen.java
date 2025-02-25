package org.example;

import java.util.ArrayList;
import java.util.List;

// Queen class
public class Queen extends Piece {
    public Queen(Position position) {
        super(position);
    }

    @Override
    public List<Position> getValidMoves() {
        List<Position> moves = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            addMove(moves, (char) (position.getColumn() + i), position.getRow());  // Right
            addMove(moves, (char) (position.getColumn() - i), position.getRow());  // Left
            addMove(moves, position.getColumn(), position.getRow() + i);  // Up
            addMove(moves, position.getColumn(), position.getRow() - i);  // Down
            addMove(moves, (char) (position.getColumn() + i), position.getRow() + i);  // Diagonal up-right
            addMove(moves, (char) (position.getColumn() - i), position.getRow() + i);  // Diagonal up-left
            addMove(moves, (char) (position.getColumn() + i), position.getRow() - i);  // Diagonal down-right
            addMove(moves, (char) (position.getColumn() - i), position.getRow() - i);  // Diagonal down-left
        }
        return moves;
    }

    private void addMove(List<Position> moves, char col, int row) {
        Position newPos = new Position(col, row);
        if (newPos.isValid()) {
            moves.add(newPos);
        }
    }
}
