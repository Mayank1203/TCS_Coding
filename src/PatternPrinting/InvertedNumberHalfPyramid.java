package PatternPrinting;

public class InvertedNumberHalfPyramid {
    public static void main(String[] args){

        int n = 5 ;

        for(int i = 0; i<n-1; i++){
            for(int j = 1 ; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
