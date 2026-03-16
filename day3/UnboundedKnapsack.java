package day3;
import java.util.*;
public class UnboundedKnapsack {
    static int unboundedKnapsack(int[] weights,int[] val,int capacity){
        int n=val.length;
        int[] dp=new int[capacity+1];
        for(int i=0;i<=capacity;i++){
            for(int j=0;j<n;j++){
                if(weights[j]<=i){
                    dp[i]=Math.max(dp[i],dp[i-weights[j]]+val[j]);
                }
            }
        }
        return dp[capacity];
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
        System.out.println(unboundedKnapsack(weights,val,capacity));
    }
    
}
