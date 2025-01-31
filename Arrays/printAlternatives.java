public class printAlternatives {
    public static void main(String[] args) {
        int arr[]={-5, 1, 4, 2, 12};
        print_alternatives(arr);
    }

    static void print_alternatives(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
