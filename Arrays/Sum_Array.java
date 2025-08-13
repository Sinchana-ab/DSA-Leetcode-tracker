import java.util.Arrays;

public class Sum_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
//        int[] arr1 = arr.clone();
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int sum = 0, n = arr.length;
        for(int  i =0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("the sum of variable is: "+sum+ " the averege of the array is "+(sum/n));
        
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        int min = arr[0], smin = Integer.MAX_VALUE;
        for(int i = 1;i<arr.length;i++){
            if(max<arr[i]){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i]!= max){
                smax = arr[i];
            }
        }
        System.out.println(max+ " us the largest element in array and second maximum element is:  "+smax);
        for(int i = 1;i<arr.length;i++){
            if(min>arr[i]){
                smin = min;
                min = arr[i];
            }
            else if(arr[i]<smin && arr[i]!= max){
                smin = arr[i];
            }
        }
        System.out.println(min+ " is the smallest element in array and second minimum element is:  "+smin);
        //int[] arr1 = Arrays.reverse(arr);

        int i = 0, j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("array elements are");
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr1));

        // for(int k = 0;k<arr.length;k++){
        //     System.out.print(arr[k]);
        // }
        //  for(int k = 0;k<arr1.length;k++){
        //     System.out.print(arr1[k]);
        // }
        int flag = 1;
        for(int k =0;k<arr.length;k++){
            if(arr[k] != arr1[k]){
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("the array is palindrom");
        }
        else{
            System.out.println("the array is not palindrome");
        }
    }
}
