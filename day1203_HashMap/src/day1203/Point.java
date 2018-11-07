package day1203;

public class Point {
	private int x;
	private double y;
	
	public Point() {
		super();
	}
	public Point(int x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	@Override
	public int hashCode() {
		/*
		 * *）相同的属性，产生相同的哈希值
		 * *）不同的属性，尽量产生不同的哈希值
		 * 
		 * 数学家发明的一种算法
		 * 是一种有效的惯用算法
		 */
		int p = 31;
		int r = 1;
		r = r*p + x;
		r = r*p + (int)y;
		return r;
	}	
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj==this) return true;
		if(! (obj instanceof Point)) return false;
		
		Point p = (Point) obj;
		return x == p.x &&
			   y == p.y;
	}
	
}









