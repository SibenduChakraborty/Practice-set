package com.company;
import java.util.Scanner;
public class Assignment7DAA {
    public static void main(String[] args) {
        System.out.println("enter the number of grids: ");
        Scanner sc= new Scanner(System.in);
        int nog= sc.nextInt();
        placeQueens(nog);
    }

    private static void placeQueens(int g){


        if(g<4){
            System.out.println("No Solution available");
        }else{
            int[][] board = new int[g][g];
            placeAllQueens(board, 0);
            printBoard(board);
        }
    }
    private static boolean placeAllQueens(int[][] board, int row){
        if(row>=board.length){
            return true;
        }

        boolean Placed = false;
        for (int j = 0; j < board.length; j++) {

            if(isSafe(board, row, j)){
                board[row][j] = 1;
                Placed = placeAllQueens(board, row+1);
            }
            if(Placed){
                break;
            }else{
                board[row][j] = 0;
            }
        }
        return Placed;
    }

    private static boolean isSafe(int[][] board, int row, int col){

        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 1){
                return false;
            }
        }
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 1){
                return false;
            }
        }
        for (int i = row-1; i >= 0; i--) {
            if(board[i][col] == 1){
                return false;
            }
        }
        return true;
    }

    private static void printBoard(int[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if(board[row][col] == 1){
                    System.out.print(" |0| ");
                }else{
                    System.out.print(" |_| ");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }
}
