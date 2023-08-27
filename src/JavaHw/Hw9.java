package JavaHw;

public class Hw9 {
    public static void main(String[] args) {
      /*
       Write a java program to find the second
       largest number in the array?
       */

        int[] numbers = {5, 10, 20, 8, 15, 7, 3};
    int secondLargest=0;
    int largest=0;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
            }
        }
