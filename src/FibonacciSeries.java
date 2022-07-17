
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of term: ");
        /* fibonacci Series = 0, 1, 1, 2, 3, 5, 8, 13, 21 ......

            0,1
            0+1 = 1
              1+1 = 2
                1+2 = 3
                  2+3 = 5
                    3+5 = 8
                    5+8 = 13
                     ...........
          */
          int  a=0, b=1  ;
          int n = sc.nextInt();
          System.out.println("The Result of first " + n + " terms of Fibonacci Series" );
            for (int i = 1; i<=n; i++){
               int  r = a+b ;
               System.out.println( a +" ");
               a = b ;
               b = r ;

          //   System.out.println(" The Result of first" + n + "terms of Fibonacci Series" );


            }
    }
}
