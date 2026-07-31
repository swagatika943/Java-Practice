package Basics;

import java.util.Scanner;

public class SpyNum {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int sum = 0;
        int mul = 1;
        while(num!=0){
            int rem = num%10;
            sum = sum+rem;
            mul = mul*rem;
            num = num/10;
        }
        if(sum==mul){
            System.out.println("Spy");
        }else{
            System.out.println("Not Spy");
        }

        // Fabonasis Series
        int range = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=1; i<=range; i++){
            System.out.println(a+" ");
            c = a+b;
            a=b;
            b=c;
        }
    }
}
