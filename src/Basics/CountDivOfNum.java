package Basics;

import java.util.Scanner;

public class CountDivOfNum {
    public static void main(String[]args){
//        int num = 20;
//        int count = 0;
//        for(int i=1; i<=num; i++){
//            if(num%i==0){
//                count++;
//            }
//        }
//        System.out.println("No of div:"+count);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur num");
        int num = sc.nextInt();
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println("No of div:"+count);
    }
}
