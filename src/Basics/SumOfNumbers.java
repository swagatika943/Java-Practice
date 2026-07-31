package Basics;

public class SumOfNumbers {
    public static void main(String [] args){
        int num = 10;
        int sum = 0;
        for(int i=0; i<=10; i++){
            sum=sum+i;
        }
        System.out.println(sum);

        //Power of nums
        int base = 3;
        int power = 1;
        int exp = 3;
        for(int i=1; i<=exp; i++){
            power = power*base;
        }
        System.out.println("Power:"+power);
    }
}
