import java.util.Scanner;
public class Recursion {

    public static int fact(int n) {
        if (n == 0) {
            return 1; 
        }
        return n * fact(n - 1);
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int trib(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return trib(n-1)+trib(n-2)+trib(n-3);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println(fact(n));
        System.out.println(fib(n));
        System.out.println(trib(n));
    }
}

