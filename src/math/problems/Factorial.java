package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    static int factorial(int n){
        int total;
        if (n==1) {
            return 1;
        }
        total = factorial(n-1)*n;
        return total;

    }

    public static void main(String[] args) {
        int k = 5;
        int factorial = factorial(k);
        System.out.println("Factorial of "+k + "  using recursive  is: "+factorial);
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        // find Factorial of a given number using Iteration.
        int n = 5;
        int fact =1;
        int i;
        for (i=1; i<=n ; i++){
            fact= fact*i;
        }
        System.out.println("THe Factorial of number " +n + " is: "+fact);

        // find Factorial of a given number using Recursion.


    }
}
