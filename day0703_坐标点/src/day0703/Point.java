package day0703;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+", "+y+")";
	}
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}
}
