public class SecondLargest {
    static void secLar(int[] arr){
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secmax=0;
        for(int i=0;i<n;i++){
            if(arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
    }
    public static void main(String[] args) {
        int[] arr={1,8,7,5,3,2};
        secLar(arr);
    }
}
