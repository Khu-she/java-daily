import java.util.*;
public class Majorityelement {
    static List<Integer> elements(int[] arr){
        int n=arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(list.size()==0 ||
               (list.size()==1 && list.get(0)!=arr[i]) ||
               (list.size()==2 && list.get(0)!=arr[i] && list.get(1)!=arr[i])){
                int count =0;
                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count>n/3){
                    list.add(arr[i]);
                }
            }
            if(list.size()==2){
                break;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 1, 1, 3, 2};
        Majorityelement me= new Majorityelement();
        System.out.println(me.elements(arr));

    }
}
