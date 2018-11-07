package day0901;

public interface Weapon {
	/*public static final */ 
	int TYPE_COLD		=0;
	int TYPE_HOT		=1;
	int TYPE_NUCLEAR	=2;
	
	/*public abstract */ 
	void kill();
	String getName();
	int getType();
}
