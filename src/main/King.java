package main;

import java.util.ArrayList;

public class King extends ChessPiece {

	public King(boolean available, Position position) {
		super(available, position);

	}
	@Override
    public boolean isValid(ChessBoard board, Position beforePos, Position afterPos) {
		//TODO
		return super.isValid(board, beforePos, afterPos);
    }
	@Override
	public ArrayList<Position> getValidPositions() {
		// TODO Auto-generated method stub
		return null;
	}

}
