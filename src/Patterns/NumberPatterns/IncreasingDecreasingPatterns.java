package Patterns.NumberPatterns;

public class IncreasingDecreasingPatterns {
    public static void main(String[]args){

        //Increasing
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Decreasing
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
