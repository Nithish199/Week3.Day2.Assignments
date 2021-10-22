package Week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSeconLargest {
	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> n = new ArrayList<Integer>();
		for (Integer i : data) {
			n.add(i);
		}
		Collections.sort(n);
		System.out.println("Sorted data is : " + n);
		System.out.println("Second largest number : " +n.get(n.size()-2));

	}
}
