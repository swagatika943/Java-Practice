package Basics;

public class SecSmallEle {
    public static void main(String[]args){
        int num = 234587;
        int small = 9;
        int secsmall = 9;
        while (num > 0){
            int ele = num%10;
            if(ele < small){
                secsmall = small;
                small = ele;
            } else if (ele < secsmall && ele != small){
                secsmall = ele;
            }
            num = num/10;
        }
        System.out.println("Secsmall:"+secsmall);
    }
}
