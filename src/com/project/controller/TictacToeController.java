package com.project.controller;

import java.util.Scanner;

public class TictacToeController {

	 public static void main (String [] args) {
	    Scanner input = new Scanner(System.in);
	    
	    //A 3x3 array stored as integers. X will be 1. O will be -1.
	    int [][] board = new int[3][3];
	    
	    while( TicTacToeModel.hasWon(board) == false){
	       
	       //Get the X player input and make the change if not taken.
	       System.out.print("X, enter row: ");
	       int row = input.nextInt();
	       System.out.print("X, enter column: ");
	       int col = input.nextInt();
	       if( board[row][col] == 0 )
	          board[row][col] = TicTacToeModel.X;
	          
	       TicTacToeView.printBoard(board);
	       
	       //Check to see if X's move won the game. If so, break out of game loop
	       if( TicTacToeModel.hasWon(board) == true )
	          break;
	       
	       //Get the O player input and make the change if not taken.
	       System.out.print("O, enter row: ");
	       row = input.nextInt();
	       System.out.print("O, enter column: ");
	       col = input.nextInt();
	       if( board[row][col] == 0 )
	          board[row][col] = TicTacToeModel.O;
	       
	       TicTacToeView.printBoard(board);
	       
	    }
	    
	    System.out.println("Game over.");
	 }
}
