import java.util.Arrays;

public class MergedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,5,4,6,7};
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length, n1 = b.length;
        int i = 0, j = 0, k=0, n2 = n+n1;
        int[] arr = new int[n2];
        while (i<n && j<n1) {
            if(a[i] <= b[j]){
                arr[k] = a[i];
                i++;
            }
            else{
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        while (i<n) {
            arr[k++] = a[i];
            i++;
        }
        while (j<n1) {
            arr[k++] = b[j];
            j++;
        }
        System.out.println("Array a is: "+(Arrays.toString(a)));
        System.out.println("Array b is: "+(Arrays.toString(b)));
        System.out.println("Array arr is: "+(Arrays.toString(arr)));
        int[] arr1 = new int[n2];
        arr1[0] = arr[0];
        int s = 1;
        for(int l =1;l < arr.length; l++){
            if(arr[l] != arr[l-1]){
                arr1[s] = arr[l];
                s++;
            }
        }
        int[] treammed = Arrays.copyOf(arr1, s);
        System.out.println("Array arr is: "+(Arrays.toString(arr1)));
        System.out.println("Array arr is: "+(Arrays.toString(treammed)));
    }
}
