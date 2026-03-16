import java.util.*;
public class DpMemoization {
    static int[] dp;
    static int fib(int n)
{
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    if(dp[n]!=-1){
        return dp[n];
    }
    return dp[n]=fib(n-1)+fib(n-2);

}    
    static int trib(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=trib(n-1)+trib(n-2)+trib(n-3);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value on n:");
        int n=sc.nextInt();
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n));
        Arrays.fill(dp,-1);
        System.out.println(trib(n));
    }
    
    
}
