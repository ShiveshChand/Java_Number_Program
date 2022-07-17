import java.util.Scanner;

public class Reverse_Integer_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
       int num = sc.nextInt();
        //   int num =-923;
        int rev = 0;
        for(int i = 1; (num!=0); i++){ // true --> loop will run false--> loop will not run
           int rem = num%10;

            rev = rev*10+rem;
            num= num/10;// 92, 9, 0


        }
        System.out.println(rev);
    }
}
