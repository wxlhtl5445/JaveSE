package day1803;

public class A {
	@Test(id=1, value="²âÊÔ´úÂë1")
	public void a() {
		System.out.println("A.a");
	}
	public void b() {
		System.out.println("A.b");
	}
	@Test(id=2)
	public void c() {
		System.out.println("A.c");
	}
	@Test("²âÊÔ´úÂë3")
	public void d() {
		System.out.println("A.d");
	}
}
