package JavaHw;

public class Hw3 {
    public static void main(String[] args) {

        int[][] numbers = {
/*
Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even
numbers only.
 */
                {1, 32, 55, 67},
                {3, 45, 68, 70},
                {6, 98, 77, 32}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {

                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col] + " ");
                }

            }
        }
    }
}