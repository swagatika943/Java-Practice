package Basics;

public class ArmStrong {
    public static void main(String[]args){
        int num=111;
        int num2 = num;
        int count = 0;
       while (num!=0){
           num = num/10;
           count++;
       }
       int exp = count;
       int num3 = num2;
       int sum = 0;
       while (num2!=0){
           int base = num2%10;
           int power = 1;
           for(int i=1; i<=exp; i++){
               power = power*base;
           }
           sum = sum+power;
           num2 = num2/10;
       }
       if(sum == num3)
           System.out.println("Arm-strong");
       else
           System.out.println("Not Arm-Strong");
    }
}
