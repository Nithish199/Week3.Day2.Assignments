package Week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingElementsInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Set<Integer> s = new HashSet<Integer>();
		for (Integer i : arr) {
			s.add(i);
		}
		System.out.println(s);
		List<Integer> l = new ArrayList<Integer>(s);
		for (int i = 1; i < s.size(); i++) {
			if(i!=l.get(i-1)) {
				System.out.println(i);
				break;
			}
		}
			
	}
}
