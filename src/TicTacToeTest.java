import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    int X = TicTacToe.X;
    int O = TicTacToe.O;
    int EMPTY = TicTacToe.EMPTY;

    @Test
    void createBoard_t1() {
        int r = 3, c = 4;
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}};
        int[][] result = TicTacToe.createBoard(r, c);
        assertArrayEquals(exp_res, result, "Board is not valid");
    }

    @Test
    void createBoard_t2() {
        int r = 3, c = 3;
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY}};
        int[][] result = TicTacToe.createBoard(r, c);
        assertArrayEquals(exp_res, result, "Board is not valid");
    }

    @Test
    void createBoard_t3() {
        int r = 4, c = 4;
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}};
        int[][] result = TicTacToe.createBoard(r, c);
        assertArrayEquals(exp_res, result, "Board is not valid");
    }

    @Test
    void createBoard_t4() {
        int r = 5, c = 4;
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}};
        int[][] result = TicTacToe.createBoard(r, c);
        assertArrayEquals(exp_res, result, "Board is not valid");
    }

    @Test
    void createBoard_t5() {
        int r = 5, c = 5;
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}};
        int[][] result = TicTacToe.createBoard(r, c);
        assertArrayEquals(exp_res, result, "Board is not valid");
    }
}