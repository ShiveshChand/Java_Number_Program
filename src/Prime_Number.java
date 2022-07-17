 // Java program to find all prime number 1 to N
 // Prime number are those number divided by 1 are itself . like  2,3,5,7,11,13,17,19,23 ....n
import java.util.Scanner;
import java.util.concurrent.Callable;

 public class Prime_Number {
  public static void main(String[] args) {
   Scanner it = new Scanner(System.in);
//   int N = it.nextInt();
   int N=8;
 for(int i=2; i<=N; i++) // i=2,3,4,5,6,7
 {
  if (isPrime(i)==true) { //
   System.out.print(i+" "); // 2 3 5 7
  }
 }

 }
  public static boolean isPrime(int n) { //
   // i=2 is already a prime number because it is starting point


    boolean checkPrime = true;
    for(int i=2; i*i<=n;i++) {  // n =4, i=3, 3*3<=6
     if(n%i==0) { // 6%2==0
      checkPrime = false;
     }

    }
    return checkPrime;
   }
}
