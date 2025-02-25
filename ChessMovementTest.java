import org.example.King;
import org.example.Pawn;
import org.example.Position;
import org.example.Queen;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ChessMovementTest {
    @Test
   public void testPawnMoves() {
        Pawn pawn = new Pawn(new Position('E', 2));
        List<Position> moves = pawn.getValidMoves();
        assertEquals(1, moves.size());
         String move= moves.toString();
        assertTrue(move.contains("E3"));
    }

    @Test
   public void testKingMoves() {
        King king = new King(new Position('D', 5));
        List<Position> moves = king.getValidMoves();
        assertEquals(8, moves.size());
        String move= moves.toString();
        assertTrue(move.contains("C4"));
        assertTrue(move.contains("E6"));
    }

    @Test
   public void testQueenMoves() {
        Queen queen = new Queen(new Position('E', 4));
        List<Position> moves = queen.getValidMoves();
        System.out.println("Queen moves: " + moves);
        assertFalse(moves.isEmpty());
        String move =moves.toString();
        assertTrue(move.contains("E1"));
        assertTrue(move.contains("A4"));
    }


    }
