import java.util.*;
import java.lang.Math;

/*

https://en.wikipedia.org/wiki/Narcissistic_number

In number theory, a narcissistic number (also known as a pluperfect digital invariant (PPDI), an Armstrong number (after Michael F. Armstrong) or a plus perfect number)
in a given number base b is a number that is the sum of its own digits each raised to the power of the number of digits.
*/

    public class Main {

        static boolean isArmstrong(int number){

        int temp;
        int digits = 0;
        int sum = 0;

        temp = number;

        while(temp>0) {
            temp = temp/10;
            digits++;
        }
        temp = number;

        while(temp>0)
        {
            //determines the last digit from the number
            int last = temp % 10;
            //calculates the power of a number up to digit times and add the resultant to the sum variable
            sum +=  (Math.pow(last, digits));
            //removes the last digit
            temp = temp/10;
        }
            return number == sum;
    }

    public static void main(String[] args) {


        System.out.print("Enter the limit: ");

        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();

        System.out.println("\nThe Armstrong Numbers up to " + limit + " are: \n");

        for(int i=0; i<=limit; i++){
            if(isArmstrong(i)) {
                System.out.print(i + "\n");
            }
        }
    }
}