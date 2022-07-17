import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = sc.nextInt();
        int sum = 0;
        int temp = input;
        for (int i = 1; input !=0; i++){
            int r = input%10 ;
            sum = sum + r*r*r ;
            input = input/10;

        }
        if (temp == sum){
            System.out.println("This is armstrong number: "+sum);
        }
        else{
            System.out.println("This is not armstrong Number: "+sum);
        }
    }
}
