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
        int result=TicTacToe.rowsIn(b);
        assertEquals(exp_res,result,"Row length is not 3");
    }
    @Test
    void row_length_t2()
    {
        int [][]b=new int[][]{{X,O,O,X,O},{O,X,O,X,X},{O,X,X,O,O},{O,X,X,O,X}};
        int exp_res=4;
        int result=TicTacToe.rowsIn(b);
        assertEquals(exp_res,result,"Row length is not 4");

    }
    @Test
    void row_length_t3()
    {
        int [][]b=new int[][]{{X,X,O,O},{X,O,O,X},{O,O,X,O},{O,X,O,X},{X,X,O,O}};
        int exp_res=5;
        int result=TicTacToe.rowsIn(b);
        assertEquals(exp_res,result,"Row length is not 5");

    }
    @Test
    void row_length_t4()
    {
        int [][]b=new int[][]{{O,O,X},{X,X,O},{O,O,X},{O,X,O}};
        int exp_res=4;
        int result=TicTacToe.rowsIn(b);
        assertEquals(exp_res,result,"Row length is not 4");

    }
    @Test
    void row_length_t5()
    {
        int [][]b=new int[][]{{X,X,O,O,X},{X,O,X,X,O},{O,O,X,O,O}};
        int exp_res=3;
        int result=TicTacToe.rowsIn(b);
        assertEquals(exp_res,result,"Row length is not 3");

    }
    @Test
    void column_length_t1()
    {
        int [][]b=new int[][]{{X,X,O,O,X},{X,O,X,X,O},{O,O,X,O,O}};
        int exp_res=5;
        int result=TicTacToe.columnsIn(b);
        assertEquals(exp_res,result,"Column length is not 5");
    }
    @Test
    void column_length_t2()
    {
        int [][]b=new int[][]{{X,X,O,O},{X,O,O,X},{O,O,X,O},{O,X,O,X},{X,X,O,O}};
        int exp_res=4;
        int result=TicTacToe.columnsIn(b);
        assertEquals(exp_res,result,"Column length is not 4");

    }
    @Test
    void column_length_t3()
    {
        int [][]b=new int[][]{{X,O,O},{O,X,X},{X,O,O},{O,X,X}};
        int exp_res=3;
        int result=TicTacToe.columnsIn(b);
        assertEquals(exp_res,result,"Column length is not 3");

    }
    @Test
    void column_length_t4() {
        int[][] b = new int[][]{{O, O, X, O}, {X, X, O, X}, {O, X, O, X}};
        int exp_res = 4;
        int result = TicTacToe.columnsIn(b);
        assertEquals(exp_res, result, "Column length is not 4");
    }
    @Test
    void column_length_t5() {
        int[][] b = new int[][]{{O, O, X, O, X}, {X, X, O, O, X}, {O, X, O, X, O}, {X, X, O, O, X}, {O, O, X, O, O}};
        int exp_res = 5;
        int result = TicTacToe.columnsIn(b);
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
    @Test
    void play_t1()
    {
        int r=1,c=2;
        int [][]b=new int[][]{{X,X,EMPTY,O},{O,O,EMPTY,X},{EMPTY,X,EMPTY,EMPTY},{O,EMPTY,X,EMPTY}};
        TicTacToe.play(b,r,c,O);
    }
    @Test
    void play_t2()
    {
        int r=2,c=4;
        int [][]b=new int[][]{{O,X,EMPTY,O,X},{EMPTY,O,X,EMPTY,EMPTY},{EMPTY,X,O,O,EMPTY},{X,EMPTY,X,EMPTY,O}};
        TicTacToe.play(b,r,c,O);
    }
    @Test
    void play_t3()
    {
        int r=1,c=1;
        int [][]b=new int[][]{{X,O,X},{X,EMPTY,O},{O,X,O}};
        TicTacToe.play(b,r,c,X);
    }
    @Test
    void play_t4()
    {
        int r=3,c=3;
        int [][]b=new int[][]{{O,EMPTY,X,X},{X,O,EMPTY,EMPTY},{O,X,X,O},{EMPTY,O,X,EMPTY}};
        TicTacToe.play(b,r,c,O);
    }
    @Test
    void play_t5()
    {
        int r=3,c=2;
        int [][]b=new int[][]{{X,X,EMPTY,O,EMPTY},{O,O,EMPTY,X,O},{EMPTY,X,EMPTY,O,EMPTY},{O,EMPTY,X,EMPTY,X},{EMPTY,X,EMPTY,O}};
        TicTacToe.play(b,r,c,O);
    }
    @Test
    void full_t1()
    {
        int [][]b=new int[][]{{X,X,EMPTY,O,EMPTY},{O,O,EMPTY,X,O},{EMPTY,X,EMPTY,O,EMPTY},{O,EMPTY,X,EMPTY,X},{EMPTY,X,EMPTY,O}};
        boolean result=TicTacToe.full(b);
        assertFalse(result);
    }
    @Test
    void full_t2()
    {
        int [][]b=new int[][]{{X,X,O,O},{X,O,O,X},{O,O,X,O},{O,X,O,X},{X,X,O,O}};
        boolean result=TicTacToe.full(b);
        assertTrue(result);
    }
    @Test
    void full_t3()
    {
        int[][]b=new int[][]{{O, O, X, O}, {X, X, O, X}, {O, X, O, X}};
        boolean result=TicTacToe.full(b);
        assertTrue(result);
    }
    @Test
    void full_t4()
    {
        int[][]b=new int[][]{{O, O, X,EMPTY, O}, {X, X, O,EMPTY, X}, {O,EMPTY, X, O, X},{X,O,O,X,EMPTY}};
        boolean result=TicTacToe.full(b);
        assertFalse(result);
    }
    @Test
    void full_t5()
    {
        int[][]b=new int[][]{{O,O,X}, {X,X,O}, {O,X,O},{X,O,X},{X,X,O}};
        boolean result=TicTacToe.full(b);
        assertTrue(result);
    }
    @Test
    void winRow_t1()
    {
        int r=0 ;
        int [][]b=new int[][]{{X,X,X,O}, {X,O,O,X}, {O,X,X,O}};
        boolean result=TicTacToe.winInRow(b,r,X);
        assertTrue(result);
    }
    @Test
    void winRow_t2()
    {
        int r=2 ;
        int [][]b=new int[][]{{X,O,O,X,O}, {O,X,X,EMPTY,EMPTY}, {X,O,O,O,X},{O,X,X,O,X}};
        boolean result=TicTacToe.winInRow(b,r,O);
        assertTrue(result);
    }
    @Test
    void winRow_t3()
    {
        int r=4 ;
        int [][]b=new int[][]{{X,O,X,O,O}, {O,X,X,O,O}, {X,O,O,X,X},{O,O,X,O,O},{EMPTY,O,X,X,X}};
        boolean result=TicTacToe.winInRow(b,r,X);
        assertTrue(result);
    }
    @Test
    void winRow_t4()
    {
        int r=2 ;
        int [][]b=new int[][]{{X,X,O,X,O},{O,X,X,O,X},{X,O,O,O,X}};
        boolean result=TicTacToe.winInRow(b,r,O);
        assertTrue(result);
    }
    @Test
    void winRow_t5()
    {
        int r=1 ;
        int [][]b=new int[][]{{O,X,O,O},{X,X,X,O},{X,O,O,X},{O,X,X,O}};
        boolean result=TicTacToe.winInRow(b,r,X);
        assertTrue(result);
    }
    @Test
    void winColumn_t1()
    {
        int c=0 ;
        int [][]b=new int[][]{{X,O,X},{X,O,O},{X,X,O},{O,O,X}};
        boolean result=TicTacToe.winInColumn(b,c,X);
        assertTrue(result);
    }
    @Test
    void winColumn_t2()
    {
        int c=1 ;
        int [][]b=new int[][]{{O,O,X,X},{O,X,O,O},{O,X,O,O},{X,X,O,X},{O,O,X,O}};
        boolean result=TicTacToe.winInColumn(b,c,X);
        assertTrue(result);
    }
    @Test
    void winColumn_t3()
    {
        int c=2 ;
        int [][]b=new int[][]{{X,O,O,X},{O,X,O,O},{O,X,O,X},{O,X,O,X}};
        boolean result=TicTacToe.winInColumn(b,c,O);
        assertTrue(result);
    }
    @Test
    void winColumn_t4()
    {
        int c=2 ;
        int [][]b=new int[][]{{X,X,O},{O,X,O},{X,O,X},{O,X,X},{O,X,X}};
        boolean result=TicTacToe.winInColumn(b,c,X);
        assertTrue(result);
    }
    @Test
    void winColumn_t5()
    {
        int c=4 ;
        int [][]b=new int[][]{{X,O,X,O,O},{X,O,O,X,O},{O,X,X,O,O},{O,O,X,O,X}};
        boolean result=TicTacToe.winInColumn(b,c,O);
        assertTrue(result);
    }
    @Test
    void winDiagonal_BS_t1()
    {
        int[][] b = new int[][]{{X, X, O}, {O, X, O}, {O, O, X}};
        boolean result = TicTacToe.winInDiagonalBS(b, X);
        assertTrue(result);
    }
    @Test
    void winDiagonal_BS_t2()
    {
        int[][] b = new int[][]{{O,O,X},{X,X,O},{O,X,O},{X,O,X}};
        boolean result = TicTacToe.winInDiagonalBS(b,X);
        assertTrue(result);
    }
    @Test
    void winDiagonal_BS_t3()
    {
        int[][] b = new int[][]{{O,O,X,X},{X,O,O,X},{O,X,X,O},{X,O,O,X},{X,O,X,O}};
        boolean result = TicTacToe.winInDiagonalBS(b, O);
        assertTrue(result);
    }
    @Test
    void winDiagonal_BS_t4()
    {
        int[][] b = new int[][]{{O,X,O,O},{X,O,X,X},{X,X,O,O},{O,X,O,X}};
        boolean result = TicTacToe.winInDiagonalBS(b, O);
        assertTrue(result);
    }
    @Test
    void winDiagonal_BS_t5()
    {
        int[][] b = new int[][]{{O,X,X,O,X},{X,O,O,X,X},{O,X,X,O,O},{X,O,O,X,X},{X,X,O,O,X}};
        boolean result = TicTacToe.winInDiagonalBS(b, X);
        assertTrue(result);
    }
    @Test
    void winDiagonal_FS_t1()
    {
        int[][] b = new int[][]{{X,O,O},{O,O,X},{O,X,X}};
        boolean result = TicTacToe.winInDiagonalFS(b, O);
        assertTrue(result);
    }
    @Test
    void winDiagonal_FS_t2()
    {
        int[][] b = new int[][]{{O,X,X,O},{O,X,EMPTY,X},{X,O,O,EMPTY}};
        boolean result = TicTacToe.winInDiagonalFS(b, X);
        assertTrue(result);
    }
    @Test
    void winDiagonal_FS_t3()
    {
        int[][] b = new int[][]{{X,O,X},{O,O,X},{X,X,O},{O,O,X},{O,X,X}};
        boolean result = TicTacToe.winInDiagonalFS(b, O);
        assertTrue(result);
    }
    @Test
    void winDiagonal_FS_t4()
    {
        int[][] b = new int[][]{{X,O,O,X},{X,EMPTY,X,EMPTY},{O,X,EMPTY,O},{O,EMPTY,X,EMPTY}};
        boolean result = TicTacToe.winInDiagonalFS(b, X);
        assertTrue(result);
    }
    @Test
    void winDiagonal_FS_t5()
    {
        int[][] b = new int[][]{{X,O,X,X,O},{O,X,O,X,X},{X,X,O,O,X},{O,O,X,O,O}};
        boolean result = TicTacToe.winInDiagonalFS(b, X);
        assertTrue(result);
    }
    @Test
    void winDiagonal_FS_t6()
    {
        int[][] b = new int[][]{{X,O,X,O,X},{O,O,X,O,O},{O,X,O,X,X},{O,O,X,X,O},{X,X,O,O,X}};
        boolean result = TicTacToe.winInDiagonalFS(b, O);
        assertTrue(result);
    }
    @Test
    void winDiagonal_FS_t7()
    {
        int[][] b = new int[][]{{O,X,EMPTY,O,X},{EMPTY,O,X,EMPTY,EMPTY},{EMPTY,X,O,O,EMPTY},{X,EMPTY,X,EMPTY,O}};
        boolean result = TicTacToe.winInDiagonalFS(b, O);
        assertFalse(result);
    }
    @Test
    void hint_t1()
    {
        int[][] b = new int[][]{{O,X,O},{X,O,X},{EMPTY,X,X}};
        int [] exp_res=new int[]{2,0};
        int []result = TicTacToe.hint(b, X);
        assertArrayEquals(exp_res,result,"Hint should be (2,0)");

    }
    @Test
    void hint_t2()
    {
        int[][] b = new int[][]{{O,X,O,EMPTY},{X,EMPTY,X,O},{O,X,O,EMPTY},{O,X,EMPTY,X}};
        int [] exp_res=new int[]{1,1};
        int []result = TicTacToe.hint(b, O);
        assertArrayEquals(exp_res,result,"Hint should be (1,1)");

    }
    @Test
    void hint_t3()
    {
        int[][] b = new int[][]{{O,EMPTY,X,X},{X,O,O,EMPTY},{O,X,X,O},{EMPTY,O,EMPTY,X}};
        int [] exp_res=new int[]{0,1};
        int []result = TicTacToe.hint(b, O);
        assertArrayEquals(exp_res,result,"Hint should be (0,1)");

    }
    @Test
    void hint_t4()
    {
        int[][] b = new int[][]{{X,EMPTY,EMPTY,EMPTY,O},{EMPTY,O,X,X,EMPTY},{EMPTY,X,O,O,X},{EMPTY,EMPTY,O,EMPTY,EMPTY},{O,EMPTY,X,EMPTY,O}};
        int [] exp_res=new int[]{1,4};
        int []result = TicTacToe.hint(b, O);
        assertArrayEquals(exp_res,result,"Hint should be (1,4)");

    }
    @Test
    void hint_t5()
    {
        int[][] b = new int[][]{{O,EMPTY,O},{O,X,X},{X,EMPTY,O},{O,X,X}};
        int [] exp_res=new int[]{2,1};
        int []result = TicTacToe.hint(b, X);
        assertArrayEquals(exp_res,result,"Hint should be (2,1)");

    }
    @Test
    void hint_t6()
    {
        int[][] b = new int[][]{{X,O,X},{X,X,O},{O,X,O}};
        int [] exp_res=new int[]{-1,-1};
        int []result = TicTacToe.hint(b, X);
        assertArrayEquals(exp_res,result,"Hint should be (-1,-1)");

    }
    @Test
    void hint_t7()
    {
        int[][] b = new int[][]{{O,X,O,X},{X,O,X,O},{EMPTY,X,X,EMPTY}};
        int [] exp_res=new int[]{2,0};
        int []result = TicTacToe.hint(b, O);
        assertArrayEquals(exp_res,result,"Hint should be (2,0)");

    }


}
