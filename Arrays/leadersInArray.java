import java.util.ArrayList;
import java.util.Collections;


public class leadersInArray {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = findLeaders(arr);
        for(int res:result){
            System.out.print(res+" ");
        }
    }

    public static ArrayList<Integer> findLeaders(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int maxRight=arr[arr.length-1];
        result.add(maxRight);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>maxRight){
                maxRight=arr[i];
                result.add(maxRight);
            }
        }
        Collections.reverse(result);
        
        return result;
    }
}
