package day1_arrays_String;

public class FirstNon_repeatingChar {
	public static int firstnonchar(String s) {
		if(s.length() <=1)
			return s.length() -1;
		
		for(int i = 0;i<s.length();i++) {
			for(int j = i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					break;
				}
			}
			return i;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println("the first non repeating character is:  "+(firstnonchar(s)));
	}
}
