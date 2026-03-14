import java.util.Scanner;

public class SmallestNumnerInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minNumnerInArr = Integer.MAX_VALUE;
        for(int num : arr){
            minNumnerInArr = Math.min(minNumnerInArr,num);
        }

        System.out.println(minNumnerInArr);
    }
}
