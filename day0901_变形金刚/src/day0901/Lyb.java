package day0901;

public class Lyb implements Weapon{
	@Override
	public void kill() {
		System.out.println("Ë£°ô");
	}
	@Override
	public String getName() {
		return "ÀÇÑÀ°ô";
	}
	@Override
	public int getType() {
		return Weapon.TYPE_NUCLEAR;
	}
}

