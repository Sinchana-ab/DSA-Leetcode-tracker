package day1_arrays_String;

import java.util.HashMap;
import java.util.Map;

public class Character_count {
//	public static Map<String, Integer>   characterWithCount(String[] ch) {
//		Map<String, Integer> map = new HashMap<>();
//		for(String c : ch) {
//			map.put(c, map.getOrDefault(c,0)+1);
//		}
//		return map;
//	}
//	public static void main(String[] args) {
//		String[] c = {"a","a","b","b","c","c","c"};
//		System.out.println("map is: "+(characterWithCount(c)));
//	}
	
	    public static int compress(char[] chars) {
	        int write = 0;  // Position to write compressed characters
	        int read = 0;   // Position to read original characters

	        while (read < chars.length) {
	            char currentChar = chars[read];
	            int count = 0;

	            // Count occurrences of currentChar
	            while (read < chars.length && chars[read] == currentChar) {
	                read++;
	                count++;
	            }

	            // Write the character
	            chars[write++] = currentChar;

	            // Write the count if greater than 1
	            if (count > 1) {
	                for (char c : String.valueOf(count).toCharArray()) {
	                    chars[write++] = c;
	                }
	            }
	        }

	        return write;
	    }

	    public static void main(String[] args) {
	        char[] chars = {'a','a','b','b','c','c','c'};
	        int newLength = compress(chars);

	        System.out.print("Compressed array: ");
	        for (int i = 0; i < newLength; i++) {
	            System.out.print(chars[i] + " ");
	        }
	        System.out.println("\nNew length: " + newLength);
	    }
	}
