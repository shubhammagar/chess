package org.example;

import java.util.*;



// Abstract class for chess pieces


// Main class
public class ChessMovement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input (Piece, Position): ");
        String input = scanner.nextLine().trim();
        scanner.close();

        String[] parts = input.split("\\s*,\\s*"); // Allows optional spaces after the comma
        if (parts.length != 2 || parts[1].length() < 2) {
            System.out.println("Invalid input format. Expected format: Piece, Position (e.g., King, E2)");
            return;
        }

        try {
            ChessPiece pieceType = ChessPiece.valueOf(parts[0].toUpperCase());
            Position position = new Position(parts[1].charAt(0), Character.getNumericValue(parts[1].charAt(1)));

            Piece piece;
            switch (pieceType) {
                case PAWN:
                    piece = new Pawn(position);
                    break;
                case KING:
                    piece = new King(position);
                    break;
                case QUEEN:
                    piece = new Queen(position);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid piece type");
            }

            List<Position> moves = piece.getValidMoves();
            System.out.println("Valid moves: " + moves);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please enter a valid chess piece and position.");
        }
    }
}
