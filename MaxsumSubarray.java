public class MaxsumSubarray {
    static void maxSum(int[] arr){
        int n=arr.length;
        int currsum=0;
        int maxsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        maxSum(arr);
    }
}
