package JavaHw;

public class Hw7Proper {
    public static void main(String[] args){
    /*
        Write a Java Program to print the first 10 numbers of Fibonacci series
         */
        int n=10;
        int[]nums=new int[n];
        nums[0]=0;
        nums[1]=1;
        for (int i = 2; i < n; i++) {
nums[i]=nums[i-1]+nums[i-2];
        }
        System.out.println("Print first "+n+" fibonacci numbers");
        for (int num:nums){
            System.out.println(num+" ");

        }
    }
}
