import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Original Number : "+n);

        int rev = 0 ;
        int r = 0 ;

        while(n>0){
            r = n%10 ;
            rev = (rev*10) + r ;
            n = n/10 ;
        }
        System.out.println("Reverse Number : "+rev);


    }
}
