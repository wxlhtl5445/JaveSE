package day1203;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(99527, "唐伯虎");
		map.put(99528, "华夫人");
		map.put(99529, "祝枝山");
		map.put(99530, "旺财");
		map.put(99531, "小强");
		map.put(99532, "石榴姐");
		map.put(99533, "秋香");
		map.put(99533, "如花");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(9527));
		System.out.println(map.get(9999));
		System.out.println(map.remove(9530));
		System.out.println(map);
	}
}
