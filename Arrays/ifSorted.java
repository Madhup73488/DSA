public class ifSorted {
    public static void main(String[] args) {
        int arr[] = {23,35,66,1,99,123};
        String result = isSorted(arr);
        System.out.println(result);
    }

    public static String isSorted(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return "NO";
            }
        }
        return "YES";
    }
}
