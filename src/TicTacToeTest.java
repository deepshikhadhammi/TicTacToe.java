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
        int r = 3, c = 4; // row and column value for the creation of board
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}}; //output for board for given number of rows and column
        int[][] result = TicTacToe.createBoard(r, c); // actual output that the createBoard function in TicTacToe returns
        assertArrayEquals(exp_res, result, "Board is not valid");  //Compares the expected and actual output.
    }

    @Test
    void createBoard_t2() {
        int r = 3, c = 3; // row and column value for the creation of board
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY}};//output for board for given number of rows and column
        int[][] result = TicTacToe.createBoard(r, c);// actual output that the createBoard function in TicTacToe returns
        assertArrayEquals(exp_res, result, "Board is not valid");//Compares the expected and actual output.
    }

    @Test
    void createBoard_t3() {
        int r = 4, c = 4; // row and column value for the creation of board
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}}; //output for board for given number of rows and column
        int[][] result = TicTacToe.createBoard(r, c);// actual output that the createBoard function in TicTacToe returns
        assertArrayEquals(exp_res, result, "Board is not valid");//Compares the expected and actual output.
    }

    @Test
    void createBoard_t4() {
        int r = 5, c = 4; // row and column value for the creation of board
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY}}; //output for board for given number of rows and column
        int[][] result = TicTacToe.createBoard(r, c);// actual output that the createBoard function in TicTacToe returns
        assertArrayEquals(exp_res, result, "Board is not valid");//Compares the expected and actual output.
    }

    @Test
    void createBoard_t5() {
        int r = 5, c = 5;  // row and column value for the creation of board
        int[][] exp_res = new int[][]{{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}};//output for board for given number of rows and column
        int[][] result = TicTacToe.createBoard(r, c);// actual output that the createBoard function in TicTacToe returns
        assertArrayEquals(exp_res, result, "Board is not valid"); //Compares the expected and actual output.
    }

    @Test
    void row_length_t1()    // function to test number of rows in a board
    {   int [][]b=new int[][]{{X,O,O},{O,X,O},{O,X,X}};  // creation of 2D array to check number of rows
        int exp_res=3;   //number of rows in b[][]
        int result=TicTacToe.rowsIn(b);  //actual output that rowsIn function returns
        assertEquals(exp_res,result,"Row length is not 3"); //compares the expected and actual output.
    }
    @Test
    void row_length_t2()
    {
        int [][]b=new int[][]{{X,O,O,X,O},{O,X,O,X,X},{O,X,X,O,O},{O,X,X,O,X}}; // creation of 2D array to check number of rows
        int exp_res=4;  //number of rows in b[][]
        int result=TicTacToe.rowsIn(b); //actual output that rowsIn function returns
        assertEquals(exp_res,result,"Row length is not 4"); //compares the expected and actual output.

    }
    @Test
    void row_length_t3()
    {
        int [][]b=new int[][]{{X,X,O,O},{X,O,O,X},{O,O,X,O},{O,X,O,X},{X,X,O,O}}; // creation of 2D array to check number of rows
        int exp_res=5;   //number of rows in b[][]
        int result=TicTacToe.rowsIn(b); //actual output that rowsIn function returns
        assertEquals(exp_res,result,"Row length is not 5");  //compares the expected and actual output.

    }
    @Test
    void row_length_t4()
    {
        int [][]b=new int[][]{{O,O,X},{X,X,O},{O,O,X},{O,X,O}}; // creation of 2D array to check number of rows
        int exp_res=4;   //number of rows in b[][]
        int result=TicTacToe.rowsIn(b);  //actual output that rowsIn function returns
        assertEquals(exp_res,result,"Row length is not 4");  //compares the expected and actual output.

    }
    @Test
    void row_length_t5()
    {
        int [][]b=new int[][]{{X,X,O,O,X},{X,O,X,X,O},{O,O,X,O,O}};  // creation of 2D array to check number of rows
        int exp_res=3;  //number of rows in b[][]
        int result=TicTacToe.rowsIn(b);  //actual output that rowsIn function returns
        assertEquals(exp_res,result,"Row length is not 3");  //compares the expected and actual output.

    }
    @Test
    void column_length_t1()
    {
        int [][]b=new int[][]{{X,X,O,O,X},{X,O,X,X,O},{O,O,X,O,O}}; //creation of 2D array to check number of columns
        int exp_res=5;   //number of columns in [][]b
        int result=TicTacToe.columnsIn(b);  //actual output that columnsIn function returns
        assertEquals(exp_res,result,"Column length is not 5"); // compares the actual and expected output.
    }
    @Test
    void column_length_t2()
    {
        int [][]b=new int[][]{{X,X,O,O},{X,O,O,X},{O,O,X,O},{O,X,O,X},{X,X,O,O}}; //creation of 2D array to check number of columns
        int exp_res=4;   //number of columns in [][]b
        int result=TicTacToe.columnsIn(b);  //actual output that columnsIn function returns
        assertEquals(exp_res,result,"Column length is not 4"); // compares the actual and expected output.

    }
    @Test
    void column_length_t3()
    {
        int [][]b=new int[][]{{X,O,O},{O,X,X},{X,O,O},{O,X,X}}; //creation of 2D array to check number of columns
        int exp_res=3;   //number of columns in [][]b
        int result=TicTacToe.columnsIn(b);  //actual output that columnsIn function returns
        assertEquals(exp_res,result,"Column length is not 3"); // compares the actual and expected output.

    }
    @Test
    void column_length_t4() {
        int[][] b = new int[][]{{O, O, X, O}, {X, X, O, X}, {O, X, O, X}}; //creation of 2D array to check number of columns
        int exp_res = 4;  //number of columns in [][]b
        int result = TicTacToe.columnsIn(b);  //actual output that columnsIN function returns
        assertEquals(exp_res, result, "Column length is not 4"); // compares the actual and expected output.
    }
    @Test
    void column_length_t5() {
        int[][] b = new int[][]{{O, O, X, O, X}, {X, X, O, O, X}, {O, X, O, X, O}, {X, X, O, O, X}, {O, O, X, O, O}}; //creation of 2D array to check number of columns
        int exp_res = 5;    //number of columns in [][]b
        int result = TicTacToe.columnsIn(b);   //actual output that columnsIN function returns
        assertEquals(exp_res, result, "Column length is not 5"); // compares the actual and expected output.
    }
    @Test
    void can_Play_t1()
    {
        int r=2, c=3;  //particular index of row and column to check if it is empty or not
        int [][]b=new int[][]{{X,EMPTY,X,X},{EMPTY,O,X,O},{EMPTY,X,X,EMPTY}};  //creation of 2D array to test
        boolean result=TicTacToe.canPlay(b,r,c);  //actual output that canPlay function returns
        assertTrue(result);
    }
    @Test
    void can_Play_t2()
    {
        int r=1, c=2; //particular index of row and column to check if it is empty or not
        int [][]b=new int[][]{{X,X,EMPTY,O},{O,O,EMPTY,X},{EMPTY,X,EMPTY,EMPTY},{O,EMPTY,X,EMPTY}}; //creation of 2D array to test
        boolean result=TicTacToe.canPlay(b,r,c); //actual output that canPlay function returns
        assertTrue(result);  //compares the result
    }
    @Test
    void can_Play_t3()
    {
        int r=3, c=3; //particular index of row and column to check if it is empty or not
        int [][]b=new int[][]{{X,EMPTY,X,X},{EMPTY,O,X,O},{EMPTY,X,X,EMPTY},{X,O,X,O}}; //creation of 2D array to test
        boolean result=TicTacToe.canPlay(b,r,c); //actual output that canPlay function returns
        assertFalse(result);  //compares the result
    }
    @Test
    void can_Play_t4()
    {
        int r=4, c=0; //particular index of row and column to check if it is empty or not
        int [][]b=new int[][]{{X,EMPTY,X,X,O},{EMPTY,O,X,O,X},{EMPTY,X,X,EMPTY,O},{X,O,O,X,EMPTY},{EMPTY,O,O,X}}; //creation of 2D array to test
        boolean result=TicTacToe.canPlay(b,r,c);  //actual output that canPlay function returns
        assertTrue(result);  //compares the result
    }
    @Test
    void can_Play_t5()
    {
        int r=2, c=4; //particular index of row and column to check if it is empty or not
        int [][]b=new int[][]{{X,EMPTY,X,X,EMPTY},{EMPTY,O,X,O,O},{EMPTY,X,X,EMPTY,X}}; //creation of 2D array to test
        boolean result=TicTacToe.canPlay(b,r,c);  //actual output that canPlay function returns
        assertFalse(result);  //compares the result
    }
    @Test
    void can_Play_t6()
    {
        int r=0, c=1;
        int [][]b=new int[][]{{X,EMPTY,X,X},{EMPTY,O,X,O},{EMPTY,X,X,EMPTY}};
        boolean result=TicTacToe.canPlay(b,r,c);  //actual output that canPlay function returns
        assertTrue(result);  //compares the result
    }
    @Test
    void play_t1()
    {
        int r=1,c=2;  //index of row and column to assign a piece
        int [][]b=new int[][]{{X,X,EMPTY,O},{O,O,EMPTY,X},{EMPTY,X,EMPTY,EMPTY},{O,EMPTY,X,EMPTY}};  //2D array in which piece needs to be assigned
        TicTacToe.play(b,r,c,O); // assigns a piece to a particular row and column index
    }
    @Test
    void play_t2()
    {
        int r=2,c=4;//index of row and column to assign a piece
        int [][]b=new int[][]{{O,X,EMPTY,O,X},{EMPTY,O,X,EMPTY,EMPTY},{EMPTY,X,O,O,EMPTY},{X,EMPTY,X,EMPTY,O}}; //2D array in which piece needs to be assigned
        TicTacToe.play(b,r,c,O); // assigns a piece to a particular row and column index
    }
    @Test
    void play_t3()
    {
        int r=1,c=1;  //index of row and column to assign a piece
        int [][]b=new int[][]{{X,O,X},{X,EMPTY,O},{O,X,O}}; //2D array in which piece needs to be assigned
        TicTacToe.play(b,r,c,X); // assigns a piece to a particular row and column index
    }
    @Test
    void play_t4()
    {
        int r=3,c=3;  //index of row and column to assign a piece
        int [][]b=new int[][]{{O,EMPTY,X,X},{X,O,EMPTY,EMPTY},{O,X,X,O},{EMPTY,O,X,EMPTY}}; //2D array in which piece needs to be assigned
        TicTacToe.play(b,r,c,O); // assigns a piece to a particular row and column index
    }
    @Test
    void play_t5()
    {
        int r=3,c=2;  //index of row and column to assign a piece
        int [][]b=new int[][]{{X,X,EMPTY,O,EMPTY},{O,O,EMPTY,X,O},{EMPTY,X,EMPTY,O,EMPTY},{O,EMPTY,X,EMPTY,X},{EMPTY,X,EMPTY,O}};//2D array in which piece needs to be assigned
        TicTacToe.play(b,r,c,O); // assigns a piece to a particular row and column index
    }
    @Test
    void full_t1()  //tests if the board is full or not
    {
        int [][]b=new int[][]{{X,X,EMPTY,O,EMPTY},{O,O,EMPTY,X,O},{EMPTY,X,EMPTY,O,EMPTY},{O,EMPTY,X,EMPTY,X},{EMPTY,X,EMPTY,O}};//2D array to check if full or not
        boolean result=TicTacToe.full(b);  //actual result that full function returns
        assertFalse(result);  //compares actual result
    }
    @Test
    void full_t2()
    {
        int [][]b=new int[][]{{X,X,O,O},{X,O,O,X},{O,O,X,O},{O,X,O,X},{X,X,O,O}}; //2D array to check if full or not
        boolean result=TicTacToe.full(b); //actual result that full function returns
        assertTrue(result); //compares actual result
    }
    @Test
    void full_t3()
    {
        int[][]b=new int[][]{{O, O, X, O}, {X, X, O, X}, {O, X, O, X}}; //2D array to check if full or not
        boolean result=TicTacToe.full(b); //actual result that full function returns
        assertTrue(result);  //compares actual result
    }
    @Test
    void full_t4()
    {
        int[][]b=new int[][]{{O, O, X,EMPTY, O}, {X, X, O,EMPTY, X}, {O,EMPTY, X, O, X},{X,O,O,X,EMPTY}}; //2D array to check if full or not
        boolean result=TicTacToe.full(b);  //actual result that full function returns
        assertFalse(result);  //compares actual result
    }
    @Test
    void full_t5()
    {
        int[][]b=new int[][]{{O,O,X}, {X,X,O}, {O,X,O},{X,O,X},{X,X,O}}; //2D array to check if full or not
        boolean result=TicTacToe.full(b); //actual result that full function returns
        assertTrue(result);  //compares actual result
    }
    @Test
    void winRow_t1()
    {
        int r=0 ;  // row index to check for win
        int [][]b=new int[][]{{X,X,X,O}, {X,O,O,X}, {O,X,X,O}};  //2D array to check if there is a win in row
        boolean result=TicTacToe.winInRow(b,r,X); //actual output that winInRow function returns
        assertTrue(result);      //compares the actual result
    }
    @Test
    void winRow_t2()
    {
        int r=2 ;   // row index to check for win
        int [][]b=new int[][]{{X,O,O,X,O}, {O,X,X,EMPTY,EMPTY}, {X,O,O,O,X},{O,X,X,O,X}};  //2D array to check if there is a win in row
        boolean result=TicTacToe.winInRow(b,r,O); //actual output that winInRow function returns
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winRow_t3()
    {
        int r=4 ;  // row index to check for win
        int [][]b=new int[][]{{X,O,X,O,O}, {O,X,X,O,O}, {X,O,O,X,X},{O,O,X,O,O},{EMPTY,O,X,X,X}};  //2D array to check if there is a win in row
        boolean result=TicTacToe.winInRow(b,r,X);  //actual output that winInRow function returns
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winRow_t4()
    {
        int r=2 ;  // row index to check for win
        int [][]b=new int[][]{{X,X,O,X,O},{O,X,X,O,X},{X,O,O,O,X}};  //2D array  to check if there is a win in row
        boolean result=TicTacToe.winInRow(b,r,O);   //actual output that winInRow function returns
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winRow_t5()
    {
        int r=1 ;  // row index to check for win
        int [][]b=new int[][]{{O,X,O,O},{X,X,X,O},{X,O,O,X},{O,X,X,O}};  //2D array to check if there is a win in row
        boolean result=TicTacToe.winInRow(b,r,X);   //actual output that winInRow function returns
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winColumn_t1()
    {
        int c=0 ;  //column index to check for win
        int [][]b=new int[][]{{X,O,X},{X,O,O},{X,X,O},{O,O,X}};  //2D array to check if there is a win in column
        boolean result=TicTacToe.winInColumn(b,c,X);  // actual output that winInColumn function returns
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winColumn_t2()
    {
        int c=1 ;   //column index to check for win
        int [][]b=new int[][]{{O,O,X,X},{O,X,O,O},{O,X,O,O},{X,X,O,X},{O,O,X,O}}; //2D array to check if there is a win in column
        boolean result=TicTacToe.winInColumn(b,c,X);   // actual output that winInColumn function returns
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winColumn_t3()
    {
        int c=2 ;    //column index to check for win
        int [][]b=new int[][]{{X,O,O,X},{O,X,O,O},{O,X,O,X},{O,X,O,X}}; //2D array to check if there is a win in column
        boolean result=TicTacToe.winInColumn(b,c,O);   // actual output that winInColumn function returns
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winColumn_t4()
    {
        int c=2 ;   //column index to check for win
        int [][]b=new int[][]{{X,X,O},{O,X,O},{X,O,X},{O,X,X},{O,X,X}}; //2D array to check if there is a win in column
        boolean result=TicTacToe.winInColumn(b,c,X);   // actual output that winInColumn function returns
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winColumn_t5()
    {
        int c=4 ;   //column index to check for win
        int [][]b=new int[][]{{X,O,X,O,O},{X,O,O,X,O},{O,X,X,O,O},{O,O,X,O,X}}; //2D array to check if there is a win in column
        boolean result=TicTacToe.winInColumn(b,c,O);   // actual output that winInColumn function returns
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winDiagonal_BS_t1()
    {
        int[][] b = new int[][]{{X, X, O}, {O, X, O}, {O, O, X}}; //2D array to check if there is a win in diagonal backwards
        boolean result = TicTacToe.winInDiagonalBS(b, X); // stores the actual result returned by winInDiagonal_BS
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winDiagonal_BS_t2()
    {
        int[][] b = new int[][]{{O,O,X},{X,X,O},{O,X,O},{X,O,X}};  //2D array to check if there is a win in diagonal backwards
        boolean result = TicTacToe.winInDiagonalBS(b,X);  // stores the actual result returned by winInDiagonal_BS
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winDiagonal_BS_t3()
    {
        int[][] b = new int[][]{{O,O,X,X},{X,O,O,X},{O,X,X,O},{X,O,O,X},{X,O,X,O}}; //2D array to check if there is a win in diagonal backwards
        boolean result = TicTacToe.winInDiagonalBS(b, O);  // stores the actual result returned by winInDiagonal_BS
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winDiagonal_BS_t4()
    {
        int[][] b = new int[][]{{O,X,O,O},{X,O,X,X},{X,X,O,O},{O,X,O,X}};  //2D array to check if there is a win in diagonal backwards
        boolean result = TicTacToe.winInDiagonalBS(b, O); // stores the actual result returned by winInDiagonal_BS
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winDiagonal_BS_t5()
    {
        int[][] b = new int[][]{{O,X,X,O,X},{X,O,O,X,X},{O,X,X,O,O},{X,O,O,X,X},{X,X,O,O,X}}; //2D array to check if there is a win in diagonal backwards
        boolean result = TicTacToe.winInDiagonalBS(b, X); // stores the actual result returned by winInDiagonal_BS
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winDiagonal_FS_t1()
    {
        int[][] b = new int[][]{{X,O,O},{O,O,X},{O,X,X}}; //2D array to check if there is a win in diagonal forward
        boolean result = TicTacToe.winInDiagonalFS(b, O); // stores the actual result returned by winInDiagonal_FS
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winDiagonal_FS_t2()
    {
        int[][] b = new int[][]{{O,X,X,O},{O,X,EMPTY,X},{X,O,O,EMPTY}};  //2D array to check if there is a win in diagonal forward
        boolean result = TicTacToe.winInDiagonalFS(b, X); // stores the actual result returned by winInDiagonal_FS
        assertTrue(result); //compares the actual result
    }
    @Test
    void winDiagonal_FS_t3()
    {
        int[][] b = new int[][]{{X,O,X},{O,O,X},{X,X,O},{O,O,X},{O,X,X}};  //2D array to check if there is a win in diagonal forward
        boolean result = TicTacToe.winInDiagonalFS(b, O); // stores the actual result returned by winInDiagonal_FS
        assertTrue(result);   //compares the actual result
    }
    @Test
    void winDiagonal_FS_t4()
    {
        int[][] b = new int[][]{{X,O,O,X},{X,EMPTY,X,EMPTY},{O,X,EMPTY,O},{O,EMPTY,X,EMPTY}};  //2D array to check if there is a win in diagonal forward
        boolean result = TicTacToe.winInDiagonalFS(b, X);  // stores the actual result returned by winInDiagonal_FS
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winDiagonal_FS_t5()
    {
        int[][] b = new int[][]{{X,O,X,X,O},{O,X,O,X,X},{X,X,O,O,X},{O,O,X,O,O}};  //2D array to check if there is a win in diagonal forward
        boolean result = TicTacToe.winInDiagonalFS(b, X); // stores the actual result returned by winInDiagonal_FS
        assertTrue(result);  //compares the actual result
    }
    @Test
    void winDiagonal_FS_t6()
    {
        int[][] b = new int[][]{{X,O,X,O,X},{O,O,X,O,O},{O,X,O,X,X},{O,O,X,X,O},{X,X,O,O,X}};  //2D array to check if there is a win in diagonal forward
        boolean result = TicTacToe.winInDiagonalFS(b, O); // stores the actual result returned by winInDiagonal_FS
        assertTrue(result);   //compares the actual result
    }
    @Test
    void winDiagonal_FS_t7()
    {
        int[][] b = new int[][]{{O,X,EMPTY,O,X},{EMPTY,O,X,EMPTY,EMPTY},{EMPTY,X,O,O,EMPTY},{X,EMPTY,X,EMPTY,O}};  //2D array to check if there is a win in diagonal forward
        boolean result = TicTacToe.winInDiagonalFS(b, O); // stores the actual result returned by winInDiagonal_FS
        assertFalse(result);  //compares the actual result
    }
    @Test
    void hint_t1()
    {
        int[][] b = new int[][]{{O,X,O},{X,O,X},{EMPTY,X,X}};  //2D array in which piece is assigned
        int [] exp_res=new int[]{2,0};  // hint value to place piece for [][]b
        int []result = TicTacToe.hint(b, X);  //actual hint value returned by hint function
        assertArrayEquals(exp_res,result,"Hint should be (2,0)"); //actual hint value returned by hint function

    }
    @Test
    void hint_t2()
    {
        int[][] b = new int[][]{{O,X,O,EMPTY},{X,EMPTY,X,O},{O,X,O,EMPTY},{O,X,EMPTY,X}}; //2D array in which piece is assigned
        int [] exp_res=new int[]{1,1};  // hint value to place piece for [][]b
        int []result = TicTacToe.hint(b, O);  //actual hint value returned by hint function
        assertArrayEquals(exp_res,result,"Hint should be (1,1)");  //actual hint value returned by hint function

    }
    @Test
    void hint_t3()
    {
        int[][] b = new int[][]{{O,EMPTY,X,X},{X,O,O,EMPTY},{O,X,X,O},{EMPTY,O,EMPTY,X}}; //2D array in which piece is assigned
        int [] exp_res=new int[]{0,1};  // hint value to place piece for [][]b
        int []result = TicTacToe.hint(b, O);  //actual hint value returned by hint function
        assertArrayEquals(exp_res,result,"Hint should be (0,1)");  //actual hint value returned by hint function

    }
    @Test
    void hint_t4()
    {
        int[][] b = new int[][]{{X,EMPTY,EMPTY,EMPTY,O},{EMPTY,O,X,X,EMPTY},{EMPTY,X,O,O,X},{EMPTY,EMPTY,O,EMPTY,EMPTY},{O,EMPTY,X,EMPTY,O}}; //2D array in which piece is assigned
        int [] exp_res=new int[]{1,4};  // hint value to place piece for [][]b
        int []result = TicTacToe.hint(b, O);  //actual hint value returned by hint function
        assertArrayEquals(exp_res,result,"Hint should be (1,4)");  //actual hint value returned by hint function

    }
    @Test
    void hint_t5()
    {
        int[][] b = new int[][]{{O,EMPTY,O},{O,X,X},{X,EMPTY,O},{O,X,X}}; //2D array in which piece is assigned
        int [] exp_res=new int[]{2,1};   // hint value to place piece for [][]b
        int []result = TicTacToe.hint(b, X);  //actual hint value returned by hint function
        assertArrayEquals(exp_res,result,"Hint should be (2,1)");  //actual hint value returned by hint function

    }
    @Test
    void hint_t6()
    {
        int[][] b = new int[][]{{X,O,X},{X,X,O},{O,X,O}}; //2D array in which piece is assigned
        int [] exp_res=new int[]{-1,-1};  // hint value to place piece for [][]b
        int []result = TicTacToe.hint(b, X);  //actual hint value returned by hint function
        assertArrayEquals(exp_res,result,"Hint should be (-1,-1)");  //actual hint value returned by hint function

    }
    @Test
    void hint_t7()
    {
        int[][] b = new int[][]{{O,X,O,X},{X,O,X,O},{EMPTY,X,X,EMPTY}}; //2D array in which piece is assigned
        int [] exp_res=new int[]{2,0};   // hint value to place piece for [][]b
        int []result = TicTacToe.hint(b, O);  //actual hint value returned by hint function
        assertArrayEquals(exp_res,result,"Hint should be (2,0)");  //actual hint value returned by hint function

    }
    @Test
    void hint_t8()
    {
        int[][] b = new int[][]{{X,EMPTY,X},{O,O,EMPTY},{O,EMPTY,O},{X,EMPTY,X}};  //2D array in which piece is assigned
        int [] exp_res=new int[]{1,2};   // hint value to place piece for [][]b
        int []result = TicTacToe.hint(b, O);  //actual hint value returned by hint function
        assertArrayEquals(exp_res,result,"Hint should be (1,2)"); //actual hint value returned by hint function

    }

    @Test
    void factorial_t1()
    {
        int n=9;  // number to find factorial for
        BigInteger result=TicTacToe.factorial(n); //actual result that factorial function returns
        BigInteger exp_res=BigInteger.valueOf(362880);  // expected output and  convert into BigInteger type
        assertEquals(exp_res,result,"Factorial is not 362880");  //compares actual and expected results
    }
    @Test
    void factorial_t2()
    {
        int n=7; // number to find factorial for
        BigInteger result=TicTacToe.factorial(n); //actual result that factorial function returns
        BigInteger exp_res=BigInteger.valueOf(5040); // expected output and convert into BigInteger type
        assertEquals(exp_res,result,"Factorial is not 5040"); //compares actual and expected results
    }
    @Test
    void factorial_t3()
    {
        int n=4; // number to find factorial for
        BigInteger result=TicTacToe.factorial(n);  //actual result that factorial function returns
        BigInteger exp_res=BigInteger.valueOf(24); // expected output and convert into BigInteger type
        assertEquals(exp_res,result,"Factorial is not 24"); //compares actual and expected results
    }
    @Test
    void factorial_t4()
    {
        int n=5;  // number to find factorial for
        BigInteger result=TicTacToe.factorial(n); //actual result that factorial function returns
        BigInteger exp_res=BigInteger.valueOf(120); //  expected result and convert into BigInteger type
        assertEquals(exp_res,result,"Factorial is not 120"); //compares actual and expected results
    }
    @Test
    void factorial_t5()
    {
        int n=3;  // number to find factorial for
        BigInteger result=TicTacToe.factorial(n); //actual result that factorial function returns
        BigInteger exp_res=BigInteger.valueOf(6); // expected result and convert into BigInteger type
        assertEquals(exp_res,result,"Factorial is not 6"); //compares actual and expected results
    }
    @Test
    void factorial_t6()
    {
        int n=0;  // number to find factorial for
        BigInteger result=TicTacToe.factorial(n); //actual result that factorial function returns
        BigInteger exp_res=BigInteger.valueOf(1); // expected result and convert into BigInteger type
        assertEquals(exp_res,result,"Factorial is not 1"); //compares actual and expected results
    }



}
