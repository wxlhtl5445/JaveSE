package day1601;

public class Test1 {
	/*
	 * 虚拟机启动后，会自动启动一个 main 线程，
	 * 在main线程中，运行main()方法
	 */
	public static void main(String[] args) {
		T1 t1 = new T1();
		T1 t2 = new T1();
		
		//启动线程
		//线程启动后，自动执行run()方法
		t1.start();
		t2.start();
		
		System.out.println("main线程执行的代码");
		
	}
	
	static class T1 extends Thread {
		@Override
		public void run() {
			//获得线程的名字
			//setName("");
			String n = getName();
			for(int i=1;i<=1000;i++) {
				System.out.println(n+" - "+i);      
			}
		}
	}
}






