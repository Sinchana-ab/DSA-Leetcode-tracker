import java.util.Arrays;

public class RotateArray {
    static void reverse(int[] arr, int start, int end){
        
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate(int[] arr, int k){
        int n = arr.length;
        k %=n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {3,6,8,9,6};
        rotate(arr, 3);
        System.out.println("rotated array: "+(Arrays.toString(arr)));
    }
}
