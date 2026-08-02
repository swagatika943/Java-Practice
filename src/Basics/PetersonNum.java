package Basics;

import java.util.Scanner;

public class PetersonNum {
    //Peterson Number is a number whose sum of the factorials of its digits is equal to the original number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Peterson Number");
        } else {
            System.out.println(num + " is not a Peterson Number");
        }
    }
}
