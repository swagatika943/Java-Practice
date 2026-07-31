package Basics;

public class StrongNum {
    public static void main(String[]args){
        int num = 1616;
        int temp = num;
        int sum = 0;
        while (num!=0){
            int rem = num%10;
            int fact = 1;
            for(int i = 1; i<=rem; i++){
                fact=fact*i;
            }
            sum = sum +fact;
            num = num/10;
        }
        if(sum==temp)
            System.out.println("Strong");
        else
            System.out.println("Not Strong");
    }
}
