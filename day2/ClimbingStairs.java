package day2;
import java.util.*;
public class ClimbingStairs {
    static long climbingStairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        long[] dp=new long[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of steps:");
        int n=sc.nextInt();
        System.out.print("No.of ways to climb step is:" + climbingStairs(n));
    }
}
