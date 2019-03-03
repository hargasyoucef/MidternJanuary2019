package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int i,j;
        int t1 =0 , t2=1;

        int n=40;
        for(i=0; i<=n; i++ ){
            System.out.print(t1+",");
            int sum= t1 + t2;
            t1 = t2;
            t2 = sum;

        }
    }
}
