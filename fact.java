public class fact {
    static int fac(int n){
        if(n==0){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        int fa = fac(5);
        System.out.println(fa);
    }
}
