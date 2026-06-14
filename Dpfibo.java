import java.util.Arrays;

public class Dpfibo {
    static int fibo(int[] dp , int n){
        if(n<=1) return n;
        if(dp[n]!=-1){
           return dp[n];
        }
        
       return dp[n]=fibo(dp,n-1)+fibo(dp,n-2);

    }
    public static void main(String[] args) {
        int n=7;
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibo(dp, n));
    }
}
