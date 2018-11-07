package day0306;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 百元买百鸡
		 * 公鸡5元1只
		 * 母鸡3元1只
		 * 小鸡1元3只
		 * 
		 * *)公鸡数量g从0到<=20
		 *      *)买g只公鸡剩的钱存到money
		 *      *)用money算母鸡最大数量存到max
		 *      *)母鸡数量m从0到<=max
		 *           *)money买m只母鸡剩的钱全买小鸡    
		 *             数量存到变量 x
		 *           *)如果g+m+x==100
		 *                *)打印这个组合
		 */
		for(int g=0; g<=20; g++) {
			int money = 100-g*5;
			int max = money/3;
			for(int m=0; m<=max; m++) {
				int x = (money-m*3)*3;
				if(g+m+x == 100) {
					System.out.println(
					 "公鸡:"+g+",母鸡:"+m+",小鸡:"+x);
				}
			}
		}
	}
}
