package org.neoa.ch03.tictactoe;

import org.neoa.ch03.tictactoe.exceptions.MissPlacedException;

public class TicTacToe {

    private char lastPlayer = '\0';

    private Character [] [] board = {
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'}
    };

    public void play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        setBox(x, y);
        lastPlayer = nextPlayer();
    }

    private void setBox(int x, int y) {
        if (board[x-1][y-1] != '\0') {
            throw new MissPlacedException("Box is occupied");
        } else {
            board[x-1][y-1] = 'X';
        }
    }

    private void checkAxis(int axis) {
        if (axis < 1 || axis > 3) {
            throw new MissPlacedException("X is outside board.");
        }
    }

    public char nextPlayer() {
        if (lastPlayer == 'X')
            return 'O';

        return 'X';
    }
}
