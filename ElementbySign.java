public class ElementbySign {
    // static void sign(int[] arr){
    //     int n= arr.length;
    //     int[] pos=new int[n];
    //     int[] neg=new int[n];
    //     int[] result=new int[n];
    //     int ne=0;
    //     int po=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>0){
    //             pos[po++]=arr[i];
    //         }
    //         else{
    //             neg[ne++]=arr[i];
    //         }
    //     }
    //     for(int i=0;i<n/2;i++){
    //         result[2*i]=pos[i];
    //         result[2*i+1]=neg[i];
    //     }
    
        
    //     for(int i:result){
    //         System.out.println(i);
    //     }
    // }
    // optimal approach
    static void sign(int[] arr){
        int n=arr.length;
        int[] result = new int[n];
        int p=0;
        int ne=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                result[p]=arr[i];
                p+=2;
            }
            else{
                result[ne]=arr[i];
                ne+=2;
            }
        }
        for(int i:result){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        sign(arr);
    }
}
