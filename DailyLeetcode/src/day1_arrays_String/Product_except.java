package day1_arrays_String;

public class Product_except {
	public static int[] product_exceptCuurent(int[] nums) {
		if(nums.length<=1)
			return nums;
		int[] product = new int[nums.length];
		for(int i = 0;i<nums.length;i++) {
			int mult = 1;
			for(int j = 0;j< nums.length;j++) {
				if(i != j) {
					mult *= nums[j];
				}
			}
			product[i] = mult;
		}
		return product;
	}
	public static void main(String[] args) {
		
	}
}
