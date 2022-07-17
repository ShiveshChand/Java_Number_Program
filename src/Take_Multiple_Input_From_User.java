import java.util.Scanner;

public class Take_Multiple_Input_From_User {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        //12
//        System.out.println("you Enter Integer Number: "+num);
//        double d = sc.nextDouble();
//        System.out.println("you Enter Float Number: "+d);
//        sc.nextLine();
//        String s = sc.nextLine();
//        System.out.println("You Enter String: "+s);
//        sc.nextLine();
//        String t = sc.nextLine();

        int a = sc.nextInt();
        System.out.println(a);
        int b = sc.nextInt();
        System.out.println(b);
        boolean checking = sc.hasNextInt();
        System.out.println("Checking Number: " + checking);

//        System.out.println("You Enter String: "+t);

      //  System.out.println(a);
//        System.out.println(b);
    }
}
