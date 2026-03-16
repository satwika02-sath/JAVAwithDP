package day3;
import java.util.*;
public class EqualPartition {
    public static boolean equalPartition(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
        int n=arr.length;
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int j=1;j<=sum;j++){
            dp[0][j]=false;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(equalPartition(arr));
    }
    
}
