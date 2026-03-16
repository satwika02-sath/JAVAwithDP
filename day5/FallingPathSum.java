package day5;
import java.util.*;
class FallingPathSum {
    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[0][i] = matrix[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up=dp[i-1][j];
                int upleft=(j>0)?dp[i-1][j-1]:Integer.MAX_VALUE;
                int upright=(j<m-1)?dp[i-1][j+1]:Integer.MAX_VALUE;
                dp[i][j]=Math.min(up,Math.min(upleft,upright))+matrix[i][j];
    }
        }
    int min= Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            min= Math.min(min, dp[n - 1][i]);
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");    
        int m = sc.nextInt();
        int n = sc.nextInt();       
        int[][] matrix = new int[m][n];
        System.out.println("Enter the matrix values:"); 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(minFallingPathSum(matrix));
    }
}