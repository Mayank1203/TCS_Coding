import java.util.Scanner;

public class SecondSmallest_LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Smallest Element ->" + SecondSmallest(arr,n));
        System.out.println("Second Largest Element ->" + SecondLargest(arr,n));

    }

    public static int SecondSmallest(int[] arr, int n) {
        if(n<2) return -1 ;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;



        for(int i = 0; i<n; i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]!= smallest){
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    public static int SecondLargest(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest =  Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){

            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }


        }

        return secondLargest;
    }
}
