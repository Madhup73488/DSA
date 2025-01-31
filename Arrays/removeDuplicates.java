
import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {23,35,66,1,23,99,123,233,23,35,1,1,99};
        int index= remDuplicates(arr);
        for(int i = 0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int remDuplicates(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
}
