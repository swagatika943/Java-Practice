package Basics;

import java.util.Scanner;

public class DuckNum {
    // A Duck Number is a number that contains at least one 0, but the first digit should not be 0
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        boolean isDuck = false;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                isDuck = true;
                break;
            }
            temp = temp / 10;
        }
        if (isDuck)
            System.out.println(num + " is a Duck Number");
        else
            System.out.println(num + " is not a Duck Number");
    }
}
