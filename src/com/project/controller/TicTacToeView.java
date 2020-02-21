package com.project.controller;

public class TicTacToeView {
	 public static void printBoard( int [][] matrix ){
		    
		    for( int row = 0; row < matrix.length; row++ ){
		       for( int col = 0; col < matrix[row].length; col++ ){
		          // Uses the "global" constants to print out appropriate letter.
		          if( matrix[row][col] == TicTacToeModel.X )
		             System.out.print("X ");
		          else if(matrix[row][col] == TicTacToeModel.O )
		             System.out.print("O ");
		          else 
		             System.out.print(". ");
		        }
		        // Goes to new line after printing each row
		        System.out.println("");
		     }
		 }
}
