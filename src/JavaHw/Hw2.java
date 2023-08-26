package JavaHw;

public class Hw2 {
    public static void main(String[] args) {
      /*
      Create an array of integer values. After the array is created, calculate
       the sum of all stored elements in that array.

       */

        int[] []numbers={
                {1,4,5,8},
                {2,7,6,9},
                {10,8,9,21}
        };
        int sum=0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum=sum+numbers[row][col];
            }
        }
        System.out.println(sum);
    }
}


