import java.util.Scanner;

public class Check_Odd_Even_Number {
    public static void main(String[] args) {
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
       int number = sc.nextInt();
       if (number %2 == 0) {
           System.out.println("Your Number is Even Number: " + number);
       }
           else {
               System.out.println("Your Number is Odd Number: "+number);

           } */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number of Term Which You Want to Check Odd Even Number: ");
        int num = in.nextInt();

        for (int i=0; i <=num; ++i){
            if (i %2 == 0 ){
                System.out.println(i+" : Even Number");
            }
            else {
                System.out.println(i+" : Odd Number");
            }

            // Using Ternary operator

         //   System.out.println((i % 2 == 0) ? + i +" Even Number" : + i +" Odd Number"); //  Using Ternary Operator

        }

       }
}

