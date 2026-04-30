public class fibo {
    static int fib(int n){
        if(n<2){
            return n; 
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
        // int n=6;
        // for(int i=1;i<=n;i++){
        //     System.out.print(fib(i)+" ");
        // }
    }
}
