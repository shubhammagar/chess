package org.example;

import java.util.ArrayList;
import java.util.List;

// Pawn class
public class Pawn extends Piece {
    public Pawn(Position position) {
        super(position);
    }

    @Override
    public List<Position> getValidMoves() {
        List<Position> moves = new ArrayList<>();
        Position forward = new Position(position.getColumn(), position.getRow() + 1);
        if (forward.isValid()) {
            moves.add(forward);
        }
        return moves;
    }
}
