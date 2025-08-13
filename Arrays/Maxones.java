public class Maxones {
    public static int rowWithMax1s(int[][] mat) {
       int n = mat.length;
       int row = -1, maxcount = 0;
       
       for(int i =0;i<n;i++){
          int count = 0;
          for(int j = 0;j<mat[i].length;j++){
              if(mat[i][j] == 1){
                count++;
              }
          }
          if(count>maxcount){
            maxcount = count;
            row = i;
          }
       }
       return row;
    }
    public static void main(String[] args) {
        int[][] a ={
            {1,0,2},
            {1,1,1},
            {0,0,0}
        };
        int result = rowWithMax1s(a);
        System.out.println("the result is "+result);
    }
}
