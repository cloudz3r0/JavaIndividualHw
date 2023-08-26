package JavaHw;

public class Hw4SumOfEvenOdd {
    public static void main(String[] args) {
      /*
      Create a 2D array of integers. Develop a program which will calculate
      the sum of even and odd numbers for that array.
       */
        int [] [] numbers= {
                {1,4,6,7,20,9},
                {2,6,8,10,7,23},
                {5,30,53,60,70}
        };
        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
              int currentNumber=numbers[i][j];

                if(currentNumber%2==0){
                    evenSum=evenSum+ currentNumber;

            }else{
                    oddSum=oddSum+currentNumber;

                }
        }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
