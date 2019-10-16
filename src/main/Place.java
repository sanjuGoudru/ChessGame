package main;

public class Place {
	private Position position;
	private ChessPiece piece;
	public Place(Position position,ChessPiece piece) {
		this.position = position;
		this.piece = piece;
	}
	public Place(Position position) {
		this(position,null);
	}
}
