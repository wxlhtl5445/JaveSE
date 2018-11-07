package day1301;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.print("用户名：");
		String n = new Scanner(System.in).nextLine();
		System.out.print("密码：");
		String p = new Scanner(System.in).nextLine();
		
		try {
			login(n, p);
			System.out.println("欢迎登录");
		} catch (UsernameNotFoundException e) {
			System.out.println("用户名错误");
		} catch (WrongPasswordException e) {
			System.out.println("密码错误");
		}
	}

	private static void login(String n, String p) throws UsernameNotFoundException, WrongPasswordException {
		// "abc", "123"
		if(! "abc".equals(n)) {
			throw new UsernameNotFoundException();
		}
		if(! "123".equals(p)) {
			throw new WrongPasswordException();
		}
	}
}






