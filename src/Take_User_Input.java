import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Take_User_Input {
    public static void main(String[] args){
        int num ;
        System.out.print("Enter The Integer Number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("Your Enter integer Number is: "+num);
    }
}
