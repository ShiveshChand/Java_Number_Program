// prime Number = 2,3,5,7,11,13,17,23.......

import java.util.Scanner;
public class Check_Prime_Number_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int input = sc.nextInt();
        boolean Check_Prime = true ;
          for (int i=2; i*i<input ; i++ ){
      //  for( int i=2 ; i<=input-1 ; i++ ){
            if (input%i==0){
                System.out.println("Number is not prime: "+input);
                Check_Prime = false;
                break;
            }

            }
        if (Check_Prime==true){
            System.out.println("Number is prime: " +input);

        }


        }

    }

