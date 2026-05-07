public class leader {
    static void lead(int[] arr){
        int n=arr.length;
        int max=arr[n-1];

         for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                System.out.println(arr[i]+" ");
                max=arr[i];
            }
         }
    }
    public static void main(String[] args) {
        int[] arr={10, 22, 12, 3, 0, 6};
        lead(arr);
    }
}
