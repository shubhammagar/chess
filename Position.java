package org.example;

// Class representing a position on the chessboard
public class Position {
    private char column;
    private int row;

    public Position(char column, int row) {
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public boolean isValid() {
        return column >= 'A' && column <= 'H' && row >= 1 && row <= 8;
    }

    @Override
    public String toString() {
        return column + String.valueOf(row);
    }
}
