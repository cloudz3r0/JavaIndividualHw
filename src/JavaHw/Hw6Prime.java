package JavaHw;

import java.util.Scanner;

public class Hw6Prime {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given number is prime or
not?*/
        boolean isPrime=true;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number");
        int num=input.nextInt();
        if(num<=1){
            System.out.println("Is not a prime number");
        }
        for (int i = 2; i * i<=num; i++) {
            if(num%i==0){
             isPrime=false;
             break;

            }
        }
        if(isPrime){
            System.out.println("Is prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
