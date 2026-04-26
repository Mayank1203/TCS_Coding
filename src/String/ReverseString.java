package String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){

//        String str = "abcdef" ;
//        char[] c = str.toCharArray() ;
//
//        int i = 0 ;
//        int j = str.length()-1 ;
//
//        while(i<j){
//            char x = c[i] ;
//            char y = c[j] ;
//            c[i] = y ;
//            c[j] = x ;
//            i++;
//            j--;
//        }
//
//        String revStr = Arrays.toString(c);
//        System.out.println(revStr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char ch;
        String nstr = "";
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed String is : " + nstr);

    }
}
