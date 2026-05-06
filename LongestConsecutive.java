import java.util.*;
public class LongestConsecutive {
    static int conSubSequence(int[] arr){
        int n=arr.length;
        int smaller=Integer.MIN_VALUE;
        int longest=1;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]-1==smaller){
                count+=1;
                smaller=arr[i];
            }
            else if(arr[i]!=smaller){
                count=1;
                smaller=arr[i];
            }
            longest=Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr={0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        LongestConsecutive lc=new LongestConsecutive();
        int result=lc.conSubSequence(arr);
        System.out.println(result);
    }
}
