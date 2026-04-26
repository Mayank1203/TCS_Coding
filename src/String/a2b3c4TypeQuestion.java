package String;

import com.sun.jdi.request.StepRequest;

import java.util.HashMap;

public class a2b3c4TypeQuestion {
    public static void main(String[] args){
        String str = "a2b3c4";

        System.out.println(getCharacterCount(str));
    }

    public static String getCharacterCount(String str){

        StringBuilder res = new StringBuilder();

        for(int i = 0; i < str.length(); i+=2){
            char ch = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i+1));

            // Immediately append the characters
            for(int j = 0; j < count; j++){
                res.append(ch);
            }
        }
        return res.toString();
    }
}
