package PatternPrinting;

public class Rectangle {
    public static void main(String[] args){
        int rows = 4;
        int coloums = 5;

        for(int i =0; i<rows; i++){
            for(int j = 0; j<coloums; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
