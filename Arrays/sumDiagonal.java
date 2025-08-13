public class sumDiagonal {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},
            {1,2,5},
            {2,6,7}
        };
        int n = a.length;
        int sum = 0,sum1 = 0;
        for(int i =0;i<n;i++){
            sum1 += a[i][i];
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                sum += a[i][j];
            }
        }
        System.out.println("the sum is: "+sum);
        System.out.println("the sum1 "+sum1);
    }
}
