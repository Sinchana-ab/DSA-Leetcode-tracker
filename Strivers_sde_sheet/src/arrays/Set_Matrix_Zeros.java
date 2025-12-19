package arrays;

import java.util.Arrays;

/*
 * Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
*/
public class Set_Matrix_Zeros {
	public static int[][] setZero(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int col =1;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					if(j != 0) {
						matrix[0][j] = 0;
					}
					else {
						col = 0;
					}
				}
			}
		}
		
		for(int i =1;i<n;i++) {
			for(int j =1;j<m;j++) {
				if(matrix[i][j] != 0) {
					if(matrix[i][0] == 0 || matrix[0][j] == 0) {
						matrix[i][j] = 0;
					}
				}
			}
		}
		
		if(matrix[0][0] == 0) {
			for(int  j = 0;j<m;j++) {
				matrix[0][j] = 0;
			}
		}
		if(col == 0) {
			for(int i = 0;i<n;i++) {
				matrix[i][0] = 0;
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		int[][] array = {
				{1,0,1},
				{1,1,1},
				{1,0,1}
		};
		System.out.println(Arrays.deepToString(array));
		int[][] matrix1 = setZero(array);
		
		System.out.println(Arrays.deepToString(matrix1));
	}
}
