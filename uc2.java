import java.util.*;
 public static void main(String[] args) {

public void printBoard() {
   for (int a = 0; a < 9; a++) { 
            board[a] = String.valueOf(a + 1); 
        } 
  
        System.out.println("Welcome to 3x3 Tic Tac Toe."); 
        printBoard();
        System.out.println(
            "X will play first. Enter a slot number to place X in:"); 
}
