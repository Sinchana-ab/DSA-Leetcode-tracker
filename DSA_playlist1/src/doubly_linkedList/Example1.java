package doubly_linkedList;

import java.util.LinkedList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 3};
		List<Integer> n = new LinkedList<Integer>();
		
		for(int i =0;i<arr.length;i++) {
			n.add(arr[i]);
		}
		System.out.println(n);
	}
}
