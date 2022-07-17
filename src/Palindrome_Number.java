// A Number Itself Reverse Number is Called Reverse Number. , 11,22,33,44,55,66,77,88,99 ......

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a nmber: ");
        int num = sc.nextInt();
        int rev = 0;
        int palindrome = num;

        for (int i = 1; (num != 0); i++) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        System.out.println(rev);
        if (palindrome == rev) {
            System.out.println("Number is Palindrome ");
        } else {
            System.out.println("Number is not Palindrome");


        }

    }
}