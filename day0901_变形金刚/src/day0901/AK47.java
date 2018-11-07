package day0901;

public class AK47 implements Weapon{
	@Override
	public void kill() {
		System.out.println("ˣǹ");
	}
	@Override
	public String getName() {
		return "AK47";
	}
	@Override
	public int getType() {
		return Weapon.TYPE_HOT;
	}
}



