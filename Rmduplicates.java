public class Rmduplicates {
    static int remove(int[] arr){
        int n=arr.length;
        int d=1;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j]){
                d++;
                j++;
                arr[j]=arr[i];
            }
        }
        return d;
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        Rmduplicates rm=new Rmduplicates();
        int a=rm.remove(arr);
        System.out.println(a);
    }
}
