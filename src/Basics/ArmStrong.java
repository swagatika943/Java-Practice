package Basics;

public class ArmStrong {
    public static void main(String[]args){
        int num=111;  // num = Used only to count the digits. It becomes 0 after the first loop
        int num2 = num;  //num2 = Used to extract each digit. It also becomes 0 after the second loop
        int count = 0;
       while (num!=0){
           num = num/10;
           count++;
       }
       int exp = count;
       int num3 = num2;  //num3 = Stores the original number so we can compare it with sum at the end
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
