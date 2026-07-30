package Basics;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[]args){
//        int num = 5;
//        int count = 0;
//        for(int i=1; i<=num; i++){
//            if(num%i==0){
//                count++;
//            }
//        }
//        if(count == 2){
//            System.out.println("Prime num");
//        } else {
//            System.out.println("Not prime num");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int num = sc.nextInt();
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count == 2) {
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
