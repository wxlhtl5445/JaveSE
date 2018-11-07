package day0801;

public class GuessLetterGame extends GuessGame {
	@Override
	public String suiJi() {
		// TODO: 稍后再完成，先写假代码
		return "ABCDE";
	}
	@Override
	public void tiShi() {
		System.out.println(
			"已经随机产生了5个不重复的大写字母");
		System.out.println("请猜这5个字母");
	}
	@Override
	public String biJiao(String c, String r) {
		// TODO: 稍后再完成，先写假代码
		return "2A2B";
	}
	@Override
	public boolean caiDui(String result) {
		return "5A0B".equals(result);
	}
}
