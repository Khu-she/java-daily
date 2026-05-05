
public class slidingwindow {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        int[] arr = {2,4,1,7,1,8,5};
        int n=arr.length;
        int maxsum=0;
        int k=3;
        for(int i=0;i<k;i++){
            maxsum+=arr[i];
        }
        int sum=maxsum;
        for(int i=0;i+k<=n-1;i++){        
            sum=sum-arr[i]+arr[i+k];
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
    
}