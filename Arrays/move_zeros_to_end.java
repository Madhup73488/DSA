public class move_zeros_to_end {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 5, 0, 0, -10, 2, 56, 98, 0 };
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int k = j; k < arr.length; k++) {
            arr[k] = 0;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
