public class countSubarray {
    static int cntSum(int[] arr,int k){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
           int sum=0;
           for(int j=i;j<n;j++){
            sum+=arr[j];
                if(sum==k){
                    count++;
                }
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {3, 1, 2, 4};
        int k=6;
        countSubarray cs=new countSubarray();
        int result=cs.cntSum(arr, k);
        System.out.println(result);
    }
}
