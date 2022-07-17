import java.util.Scanner;

public class Check_Number_Perfect_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqr = 1 ;
      //  for(int i=1; i<=num;i++){

     //   }
        sqr = num*num;
        num = sqr;
        if(num == num*num){
            System.out.println(num);
        }else {
            System.out.println("number is not perfect square: "+num);
        }

    }
}
