import java.util.*;
public class recur {
    static void linear(int i,int n){
        if(i<1) return;
        linear(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        linear(n,n);

    }
}
