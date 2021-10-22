package Week3.Day2.Assignments;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	public static void main(String[] args) {
		int[] a1 = { 3, 2, 11, 4, 6, 7 };
		int[] a2 = { 1, 2, 8, 4, 9, 7 };
		Set<Integer> one = new HashSet<Integer>();
		for (Integer i : a1) {
			one.add(i);
					}
	
		Set<Integer> two = new HashSet<Integer>();
		for (Integer in : a2) {
			two.add(in);		
				}
		one.retainAll(two);
		System.out.println(one);
	}
}
