public class kadaneindex {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5};
        int n=arr.length;
        int currsum=arr[0];
        int maxsum=arr[0];
        int start=0, tempstart =0, end=0;
        for(int i =0;i<n;i++){
            if(arr[i]>currsum+arr[i]){
                currsum=arr[i];
                tempstart = i;
            }else{
                currsum+=arr[i];
            }
            if(currsum>maxsum){
                maxsum=currsum;
                start = tempstart;
                end=i;
            }
        }
        System.out.println(maxsum);
        System.out.println(start + " " + end);
    }
}
