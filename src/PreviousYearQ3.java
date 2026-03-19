import java.util.*;

public class PreviousYearQ3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       sc.nextLine();
       String[] str = new String[n];

       for(int i = 0; i<n; i++){
           str[i] = sc.nextLine() ;
       }

       int col = str[0].length();
       int count = 0;

       for(int i = 0; i<col; i++){
           for(int j = 1; j<n; j++){
               if(str[j].charAt(i) < str[j-1].charAt(i)){
                   count++;
                   break;
               }
           }
       }

       System.out.println(count);
    }
}
