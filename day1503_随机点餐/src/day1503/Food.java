package day1503;
/*
 * 实现了Comparable 接口的对象，
 * 都具有直接比较大小的能力
 */
public class Food implements Comparable<Food> {
	private String name;
	private int times;
	
	public Food() {
		super();
	}
	public Food(String name, int times) {
		super();
		this.name = name;
		this.times = times;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	@Override
	public String toString() {
		return name+";"+times;
	}
	/*
	 * 当前对象，与参数对象o比较大小
	 * 当前对象大，正数
	 * 当前对象小，负数
	 * 相同，0
	 */
	@Override
	public int compareTo(Food o) {
		return times - o.times;
	}
}





