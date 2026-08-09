import java.util.*;

public class NextPermutation {
    static void permutation(int[] arr){
        int idx=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx == -1){
            rev(arr,0,arr.length-1);
            return;
        }
        for(int i=arr.length-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                swap(arr,i,idx);
                break;
            }
        }
        rev(arr,idx+1,arr.length-1);
    }
    static void rev(int[] arr, int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        permutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
