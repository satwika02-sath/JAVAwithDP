package day4;
import java.util.*;
public class ShortestCommonSupersequence {
    public static String shortestCommonSupersequence(String s1,String s2){
        int n=s1.length(),m=s2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        StringBuilder res=new StringBuilder();
        int i=n,j=m;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                res.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                res.append(s1.charAt(i-1));
                i--;
            }
        else{
            res.append(s2.charAt(j-1));
            j--;
        }
    }
    while(i>0){
        res.append(s1.charAt(i-1));
        i--;
    }
    while(j>0){
        res.append(s2.charAt(j-1));
        j--;
    }
    return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string s1:");
        String s1=sc.nextLine();
        System.out.println("Enter the second string s2:");
        String s2=sc.nextLine();
        System.out.println(shortestCommonSupersequence(s1,s2));
    
    }
    
}
