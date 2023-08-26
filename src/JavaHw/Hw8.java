package JavaHw;

public class Hw8 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in the array?
         */
        int[]arr={10,50,60,80,70};
        int largest=arr[0];

        for(int n:arr) {
            if (n > largest) {
                largest = n;
            }

        } System.out.println(largest);
            int smallest=arr[0];
            for(int s:arr){
                if(s<smallest){
                    smallest=s;

                }

            }   System.out.println(smallest);
            }
        }


