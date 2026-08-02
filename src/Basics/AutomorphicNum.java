package Basics;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int div = 1;
        for (int i = 1; i <= digits; i++) {
            div *= 10;
        }
        if (square % div == num) {
            System.out.println(num + " is an Automorphic Num");
        } else {
            System.out.println(num + " is not an Automorphic Num");
        }
    }
}
