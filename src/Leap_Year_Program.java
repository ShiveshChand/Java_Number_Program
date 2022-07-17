import java.util.Scanner;

// A year which is divisible by 400 & 4 is called leap year.
public class Leap_Year_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = sc.nextInt();
        if((year%4==0 && year%100 != 0) || (year%100==0 && year%400==0)){
            System.out.println("leap year = "+year);
        }else
            System.out.println("this not lear = "+year);





        }


    }


