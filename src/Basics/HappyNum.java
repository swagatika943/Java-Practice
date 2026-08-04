package Basics;

import java.util.Scanner;

public class HappyNum {
    //Find the square of every digit, Add them repeat the process, If the answer becomes 1, it is a Happy Number
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp;
        while (num != 1 && num != 4) {
            temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit);
                temp = temp / 10;
            }
            num = sum;
        }
        if (num == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }
}
