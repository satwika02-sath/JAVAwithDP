//LINK:https://leetcode.com/problems/house-robber/submissions/1946865664/
package day2;
import java.util.*;

import java.util.Scanner;

public class HouseRobber1 {
    public static int houseRobber(int[] money){
        int n=money.length;
        if(n==1){
            return money[0];
        }
        if(n==2){
            return Math.max(money[0],money[1]);
        }
        int[] dp=new int[n];
        dp[0]=money[0];
        dp[1]=Math.max(money[0],money[1]);
        for(int i=2;i<n;i++){
            int case1=dp[i-1];
            int case2=dp[i-2]+money[i];
            dp[i]=Math.max(case1, case2);
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of houses:");
        int n=sc.nextInt();
        System.out.println("Enter the money in house:");
        int[] money=new int[n];
        for(int i=0;i<n;i++){
            money[i]=sc.nextInt();
        }
        System.out.println(houseRobber(money));
    }
    
}
