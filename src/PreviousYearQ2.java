import java.util.*;

public class PreviousYearQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Tip: Use hasNext() to avoid exceptions if input is empty
        if (!sc.hasNext()) return;

        String word = sc.next();
        PreviousYearQ2 p = new PreviousYearQ2();

        // Rule 1: All Caps (USA)
        // Rule 2: All Small (leetcode)
        // Rule 3: First Cap, rest small (Google)
        if(p.allCapital(word) || p.allSmall(word) ||
                (Character.isUpperCase(word.charAt(0)) && p.allSmall(word.substring(1)))){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public boolean allCapital(String word){
        for(char c : word.toCharArray()){
            if(c < 'A' || c > 'Z') return false;
        }
        return true;
    }

    public boolean allSmall(String word){
        for(char c : word.toCharArray()){
            // FIXED: Range must be 'a' through 'z'
            if(c < 'a' || c > 'z') return false;
        }
        return true;
    }
}