package day1301;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		/*
		 * "2018-10-19"
		 * "2018-10-2"
		 */
		List<String> list = 
		 new ArrayList<String>();
		Collections.addAll(
			list,
			"2018-10-19",
			"2018-10-2",
			"2018-10-31",
			"dsfgsdfgsdfgsdfg",
			"2018-10-3",
			"2018-10-2",
			"2018-10-25");
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				SimpleDateFormat sdf = 
				 new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date d1 = sdf.parse(o1);
					Date d2 = sdf.parse(o2);
					return d1.compareTo(d2);
				} catch (ParseException e) {
					//main->f1->sort->compare
					throw new RuntimeException(e);
				}
			}
		});
		System.out.println(list);
		
		
	}
}










