package Week3.Day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDupilcates {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> unique = new LinkedHashSet<Integer>();
		System.out.println("Duplicate values are : ");
		for (int i = 0; i < arr.length; i++) {
			if (unique.add(arr[i]) == false) {
				System.out.println(arr[i]);
						}  
			}
		
	}
}
