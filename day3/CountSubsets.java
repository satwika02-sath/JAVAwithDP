package day3;
import java.util.*;
public class CountSubsets {
    static int countSubsets(int[] nums,int target){
        int n=nums.length;
        int[][] dp=new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j-nums[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target= sc.nextInt();
        int result=countSubsets(nums,target);
        System.out.println("Number of subsets with given sum: "+result);
    }
    
}
