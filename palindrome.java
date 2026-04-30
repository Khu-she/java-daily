public class palindrome {
    static boolean pali(int x){
       int og=x;
       int b=0;

       while(x>0){
        int r=x%10;
        b=b*10+r;
        x=x/10;
       }
       return og == b;
    }
    public static void main(String[] args) {
        System.out.println(pali(1221));


    }
}
