package Basics;

import java.util.Scanner;
public class KaprekarNum {
    //Find the square of the number,Split the square into two parts,Add both parts,If the sum equals the original number, it is a Kaprekar Number.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        int divisor = 1;

        for (int i = 1; i <= digits; i++) {
            divisor = divisor * 10;
        }
        int right = square % divisor;
        int left = square / divisor;
        if (left + right == num)
            System.out.println(num + " is a Kaprekar Number");
        else
            System.out.println(num + " is not a Kaprekar Number");
    }
}
