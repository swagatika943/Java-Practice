package Basics;

import java.util.Scanner;

public class DivisersOfNum {
    public static void main(String[]args){

        int num = 40;
        for(int i=1; i<=40; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a num");
//        int num = sc.nextInt();
//        for(int i=1; i<= num; i++){
//            if(num%i==0){
//                System.out.println(i);
//            }
//        }
    }
}
