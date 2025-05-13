package com.chess;
public class Bishop extends Piece {
	public Bishop(boolean isWhite) {
		super(isWhite, "Bishop", new javax.swing.ImageIcon(ClassLoader.getSystemResource("/image/bishop" + (isWhite ? "white" : "black") + ".png")));
	}
	
	@Override
	public boolean isValidMove(int srcRow, int srcCol, int destRow, int destCol, Piece[][] board) {
		int direction = isWhite ? -1 : 1;
		if (srcCol == destCol && board[destRow][destCol] == null) {
			return destRow - srcRow == direction;
		} else if (Math.abs(destCol = srcCol) == 1 && destRow - srcRow == direction && board[destRow][destCol] != null) {
			return board[destRow][destCol].isWhite() != this.isWhite;
		}
		return false;
	}
}
