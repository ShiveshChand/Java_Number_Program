import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Prime_Number_Between_Two_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Digit: ");
        int first_input = sc.nextInt();
        System.out.println("Enter Second Digit: ");
        int second_input = sc.nextInt();
        for (int i = first_input; i <= second_input; i++) {
            if (is_prime(i) == true) {
                System.out.println(i + "");
            }
        }
    }
        public static boolean is_prime(int n){
        boolean check_Prime=true;
            for (int i=2; i*i<n; i++ ){
                if(n%i==0){
                    check_Prime = false;
                }
            }
            return check_Prime;

        }



}
