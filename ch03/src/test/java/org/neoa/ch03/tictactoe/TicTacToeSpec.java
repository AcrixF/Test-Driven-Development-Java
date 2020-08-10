package org.neoa.ch03.tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.neoa.ch03.tictactoe.exceptions.MissPlacedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TicTacToeSpec {

    private TicTacToe ticTacToe;

    @Before
    public void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void whenXOutsideBoardThenRuntimeException() {
        assertThrows(MissPlacedException.class , () -> ticTacToe.play(5,2));

    }

    @Test
    public void whenYOutsideBoardThenRuntimeException() {
        assertThrows(MissPlacedException.class, () -> ticTacToe.play(2,5));
    }

    @Test
    public void whenOccupiedThenRuntimeException() {
        ticTacToe.play(2,1);
        assertThrows(MissPlacedException.class, () -> ticTacToe.play(2,1));
    }

    @Test
    public void givenFirstTurnWhenNextPlayerThenX() {
        assertEquals('X', ticTacToe.nextPlayer());
    }

    @Test
    public void givenLastTurnWasXWhenNextPlayerThenO() {
        ticTacToe.play(1,1);
        assertEquals('O', ticTacToe.nextPlayer());
    }

    @Test
    public void givenLastTurnWasOWhenNextPlayerThenX() {
        ticTacToe.play(1,1);
        ticTacToe.play(1,2);
        assertEquals('X', ticTacToe.nextPlayer());
    }

}
