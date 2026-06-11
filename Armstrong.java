public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp=n;
        int sum=0;
        while(temp>0){
            int d=temp%10;
            temp /= 10;

            // sum+=Math.pow(d,3);
            sum+=d*d*d;

        }
        if(sum==n){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
