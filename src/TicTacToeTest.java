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

    @Test
    void row_length_t1()
    {   int [][]b=new int[][]{{X,O,O},{O,X,O},{O,X,X}};
        int exp_res=3;
        int result=TicTacToe.rowsln(b);
        assertEquals(exp_res,result,"Row length is not 3");
    }
    @Test
    void row_length_t2()
    {
        int [][]b=new int[][]{{X,O,O,X,O},{O,X,O,X,X},{O,X,X,O,O},{O,X,X,O,X}};
        int exp_res=4;
        int result=TicTacToe.rowsln(b);
        assertEquals(exp_res,result,"Row length is not 4");

    }
    @Test
    void row_length_t3()
    {
        int [][]b=new int[][]{{X,X,O,O},{X,O,O,X},{O,O,X,O},{O,X,O,X},{X,X,O,O}};
        int exp_res=5;
        int result=TicTacToe.rowsln(b);
        assertEquals(exp_res,result,"Row length is not 5");

    }
    @Test
    void row_length_t4()
    {
        int [][]b=new int[][]{{O,O,X},{X,X,O},{O,O,X},{O,X,O}};
        int exp_res=4;
        int result=TicTacToe.rowsln(b);
        assertEquals(exp_res,result,"Row length is not 4");

    }
    @Test
    void row_length_t5()
    {
        int [][]b=new int[][]{{X,X,O,O,X},{X,O,X,X,O},{O,O,X,O,O}};
        int exp_res=3;
        int result=TicTacToe.rowsln(b);
        assertEquals(exp_res,result,"Row length is not 3");

    }
    @Test
    void column_length_t1()
    {
        int [][]b=new int[][]{{X,X,O,O,X},{X,O,X,X,O},{O,O,X,O,O}};
        int exp_res=5;
        int result=TicTacToe.columnsln(b);
        assertEquals(exp_res,result,"Column length is not 5");
    }
    @Test
    void column_length_t2()
    {
        int [][]b=new int[][]{{X,X,O,O},{X,O,O,X},{O,O,X,O},{O,X,O,X},{X,X,O,O}};
        int exp_res=4;
        int result=TicTacToe.columnsln(b);
        assertEquals(exp_res,result,"Column length is not 4");

    }
    @Test
    void column_length_t3()
    {
        int [][]b=new int[][]{{X,O,O},{O,X,X},{X,O,O},{O,X,X}};
        int exp_res=3;
        int result=TicTacToe.columnsln(b);
        assertEquals(exp_res,result,"Column length is not 3");

    }
    @Test
    void column_length_t4() {
        int[][] b = new int[][]{{O, O, X, O}, {X, X, O, X}, {O, X, O, X}};
        int exp_res = 4;
        int result = TicTacToe.columnsln(b);
        assertEquals(exp_res, result, "Column length is not 4");
    }
    @Test
    void column_length_t5() {
        int[][] b = new int[][]{{O, O, X, O, X}, {X, X, O, O, X}, {O, X, O, X, O}, {X, X, O, O, X}, {O, O, X, O, O}};
        int exp_res = 5;
        int result = TicTacToe.columnsln(b);
        assertEquals(exp_res, result, "Column length is not 5");
    }
    @Test
    void can_Play_t1()
    {
        int r=2, c=3;
        int [][]b=new int[][]{{X,EMPTY,X,X},{EMPTY,O,X,O},{EMPTY,X,X,EMPTY}};
        boolean result=TicTacToe.canPlay(b,r,c);
        assertTrue(result);
    }
    @Test
    void can_Play_t2()
    {
        int r=1, c=2;
        int [][]b=new int[][]{{X,X,EMPTY,O},{O,O,EMPTY,X},{EMPTY,X,EMPTY,EMPTY},{O,EMPTY,X,EMPTY}};
        boolean result=TicTacToe.canPlay(b,r,c);
        assertTrue(result);
    }
    @Test
    void can_Play_t3()
    {
        int r=3, c=3;
        int [][]b=new int[][]{{X,EMPTY,X,X},{EMPTY,O,X,O},{EMPTY,X,X,EMPTY},{X,O,X,O}};
        boolean result=TicTacToe.canPlay(b,r,c);
        assertFalse(result);
    }
    @Test
    void can_Play_t4()
    {
        int r=4, c=0;
        int [][]b=new int[][]{{X,EMPTY,X,X,O},{EMPTY,O,X,O,X},{EMPTY,X,X,EMPTY,O},{X,O,O,X,EMPTY},{EMPTY,O,O,X}};
        boolean result=TicTacToe.canPlay(b,r,c);
        assertTrue(result);
    }
    @Test
    void can_Play_t5()
    {
        int r=2, c=4;
        int [][]b=new int[][]{{X,EMPTY,X,X,EMPTY},{EMPTY,O,X,O,O},{EMPTY,X,X,EMPTY,X}};
        boolean result=TicTacToe.canPlay(b,r,c);
        assertFalse(result);
    }
    @Test
    void can_Play_t6()
    {
        int r=0, c=1;
        int [][]b=new int[][]{{X,EMPTY,X,X},{EMPTY,O,X,O},{EMPTY,X,X,EMPTY}};
        boolean result=TicTacToe.canPlay(b,r,c);
        assertTrue(result);
    }

}