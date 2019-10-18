package main;

public class ChessPiece {
	private boolean avialable;
	private Position position;
	
	public ChessPiece(boolean available, Position position) {
		this.avialable = available;
		this.position = position;
	}
	
	public boolean isAvailable() {
		return avialable;
	}
	public void setAvailability(boolean available) {
		this.avialable = available;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public boolean isValid(ChessBoard board, Position beforePos, Position afterPos){
		int beforeX = beforePos.getX();
		int beforeY = beforePos.getY();
		int afterX = afterPos.getX();
		int afterY = afterPos.getY();
        if(beforeX == afterX || beforeY == afterY )
            return false;
        if(afterX < 0 || afterX > 7 || beforeX < 0 || beforeX > 7 || afterY < 0 || afterY > 7 || beforeY <0 || beforeY > 7)
            return false;
        return true;
    }
}
