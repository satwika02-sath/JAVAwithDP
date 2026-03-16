package day2;
import java.util.*;
public class FrogJump {
    static int frogJump(int[] steps){
        int n=steps.length;
        if(n==1){
            return 0;
        }
        if(n==2){
            return Math.abs(steps[1]-steps[0]);
        }
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(steps[1]-steps[0]);
        for(int i=2;i<n;i++){
            int jump1=dp[i-1]+Math.abs(steps[i]-steps[i-1]);
            int jump2=dp[i-2]+Math.abs(steps[i]-steps[i-2]);
            dp[i]=Math.min(jump1,jump2);
        }
        return dp[n-1];  
}
 public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of steps:");
        int n=sc.nextInt();
        System.out.println("Enter the heights of steps:");
        int[] steps=new int[n];
        for(int i=0;i<n;i++){     
            steps[i]=sc.nextInt();
        }
        System.out.println(frogJump(steps));
}
}