package day3;
import java.util.*;
public class Knapsack01 {
    static int knapsack(int[] weights,int[] val,int capacity){
        int n=val.length;
        int[][] dp=new int[n+1][capacity+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=capacity;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(weights[i-1]<=j){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weights[i-1]]+val[i-1]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of items:");
        int n=sc.nextInt();
        System.out.println("Enter the weights of items:");
        int[] weights=new int[n];
        for(int i=0;i<n;i++){
            weights[i]=sc.nextInt();
        }
        System.out.println("Enter the values of items:");
        int[] val=new int[n];
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        System.out.println("Enter the capacity of knapsack:");
        int capacity=sc.nextInt();
        System.out.println(knapsack(weights,val,capacity));
    }
    
}
