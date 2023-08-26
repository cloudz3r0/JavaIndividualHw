package JavaHw;

import java.sql.SQLOutput;

public class Hw1 {
    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of temperatures for
        a week, and then uses a loop to find the highest and lowest
        temperature for the week.
         */
        int[] temps = {60, 80, 70, 60, 50, 90, 100};
        int smallest = temps[0];
        int largest = temps[0];
        for (int n : temps) {
            if (n > largest) {
                largest = n;
        if(n<smallest){
           smallest=n;
}

                }


            }
            System.out.println(largest);
        System.out.println(smallest);
        }

    }

