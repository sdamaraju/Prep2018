package impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortAList {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(1);a.add(2);
		System.out.println(a);
		a.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return -1;
			}
		});
		System.out.println(a);
	}

}
