package Basics;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int original = num;
        while(num!=0){
            int rem = num%10;
            System.out.println(rem);
            num = num/10;
        }
//        System.out.println("Num:"+num);
         System.out.println("Original Number: " + original);
    }
}
