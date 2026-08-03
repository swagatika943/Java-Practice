package Basics;

import java.util.Scanner;

public class NeonNum {
    public static void main(String [] args){
        //The sum of the digits of its square is equal to the original number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;
        while(square>0){
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }
        if(sum==num){
            System.out.println("is NeonNum");
        } else {
            System.out.println("is not NeonNum");
        }
    }
}
