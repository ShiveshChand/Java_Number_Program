import java.util.Scanner;

public class Greatest_of_Three_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i=1; i<=num; i++){
          int input = sc.nextInt();
          if (input > max){
              max = input;
          }

        }
        System.out.println(max);
    }
}
