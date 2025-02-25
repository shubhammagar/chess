package org.example;

import java.util.ArrayList;
import java.util.List;

// King class
public class King extends Piece {
    private static final int[] ROW_MOVES = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] COL_MOVES = {-1, 0, 1, -1, 1, -1, 0, 1};

    public King(Position position) {
        super(position);
    }

    @Override
    public List<Position> getValidMoves() {
        List<Position> moves = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Position newPos = new Position((char) (position.getColumn() + COL_MOVES[i]), position.getRow() + ROW_MOVES[i]);
            if (newPos.isValid()) {
                moves.add(newPos);
            }
        }
        return moves;
    }
}
