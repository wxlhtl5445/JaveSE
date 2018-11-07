package day0903;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
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
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		/*
		 * a = new Point(3,4);
		 * a.equals(null)
		 * a.equals(a)
		 * a.equals(new Soldier())
		 */
		if(obj == null) return false;
		if(obj == this) return true;
		if(! (obj instanceof Point)) return false;
		
		//当前对象的x,y，与参数对象的x,y比较
		Point p = (Point) obj;
		
		return x == p.x && y == p.y;
	}
}





