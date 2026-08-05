package Basics;

public class SecLargestEle {
    public static void main(String[]args){
        int num= 248736;
        int large = -1;
        int seclarge = -1;
        while(num > 0){
            int ele = num%10;
            if(ele > large){
                seclarge = large;
                large = ele;
            } else if (ele > seclarge && ele != large){
                seclarge = ele;
            }
            num = num/10;
        }
        System.out.println("Seclarge:"+seclarge);
    }
}
