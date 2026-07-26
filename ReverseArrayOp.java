public class ReverseArrayOp {
    static void reverse(int i,int[] arr){
        int n=arr.length;
        if(i>=n/2) return;

        swap(i,n-i-1,arr);
        reverse(i+1, arr);

    }
    static void swap(int l,int r, int[] arr){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(0,arr);
        for(int i:arr){
            System.out.print(i+",");
        }
    }
}
