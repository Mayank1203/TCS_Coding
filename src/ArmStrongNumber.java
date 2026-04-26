import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        int no = Sc.nextInt();
        int org = no ;
        int r = 0 ;
        int sum = 0 ;

        while(no>0){
            r = no%10 ;
            no = no/10 ;
            sum += r*r*r ;
        }

        if(sum == org) System.out.println("It is a ArmStrong number");
        else System.out.println("It is not a ArmStrong number");
    }
}
