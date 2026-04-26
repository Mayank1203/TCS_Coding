package String;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        duplicateCharacterCount(str);
    }

    public static void duplicateCharacterCount(String str){


        HashMap<Character , Integer> map = new HashMap<>() ;

        for(char c : str.toCharArray()){
            if(c != ' ') {
                map.put(c , map.getOrDefault(c,0)+1);
            }
        }

        Set<Character> set = map.keySet();
        System.out.println("Duplicate Characters in : " + str);
        for(char c : set){
            if(map.get(c)>1){
                System.out.println(c + " : "+ map.get(c));
            }
        }
    }
}
