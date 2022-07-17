import java.util.Scanner;

public class Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
//        time complexity= 1+2+3+4+5=n(n+1)/2=n^2
        for (int i=1; i<=input; i++){
            for(int j=input ; j>=1; j--){

                if(j==i) System.out.print("*");
                else System.out.print(j);
            }
            System.out.println();
        }
    }

}
