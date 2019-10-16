package main;

public class Position {
	private int x,y;
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) throws IllegalArgumentException{
		if(x>=0 && x<=7)
			this.x = x;
		else
			throw new IllegalArgumentException("X value invalid. X: "+x);
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if(y>=0 && y<=7)
			this.y = y;
		else
			throw new IllegalArgumentException("y value invalid. Y: "+y);
	}
	
}
