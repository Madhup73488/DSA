
// import java.util.Scanner;
public class array_implementation{
    public static void main(String[] args){
        // int[] arr1 = {1,2,3,4,5};

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array :");
        // int n = sc.nextInt();
        // int[] arr2 = new int[n];
        // System.out.println("Enter "+n+" elements:");
        // for(int i=0;i<n;i++){
        //     arr2[i]=sc.nextInt();
        // }
        // System.out.println("Array elements are :");
        // for(int j=0;j<n;j++){
        //     System.out.print(arr2[j]+" ");
        // }
        // sc.close();


        // Linear search
        int arr3[] = {32,11,6234,2,66,84,22,93};
        int key = 66;
        linearSearch ls = new linearSearch();
        int index = ls.linear_Search(arr3, key);
        System.out.println(key+" is present at index : "+index);

        
    }
}