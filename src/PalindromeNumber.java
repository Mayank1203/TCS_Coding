import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int n = num.length();

        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(num , n));
    }

    public boolean isPalindrome(String num , int n) {
        int i = 0;
        int j = n-1;


        while(i<j){
            if(num.charAt(i)!=num.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true ;
    }
}
