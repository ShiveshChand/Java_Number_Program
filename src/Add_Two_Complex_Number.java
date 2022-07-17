import java.util.Scanner;

public class Add_Two_Complex_Number {

 /*   int real;  int img;
    Add_Two_Complex_Number(int r , int i ){
        this.real = r ;
        this.img = i ;
    }

    public static Add_Two_Complex_Number sum(Add_Two_Complex_Number c1 , Add_Two_Complex_Number c2){
        Add_Two_Complex_Number temp = new Add_Two_Complex_Number(0,0);
        temp.real = c1.real+c2.real;
        temp.img = c1.img+ c2.img ;
        return temp ;
    }
    public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);
    //    int temp = sc.nextInt();
        Add_Two_Complex_Number c1 = new Add_Two_Complex_Number(10 , 15);
        Add_Two_Complex_Number c2 = new Add_Two_Complex_Number(5 , 25);
        Add_Two_Complex_Number temp = sum(c1 , c2);
        System.out.print("Sum is: "+temp.real+ "+" +temp.img +"i" );
} */

    public static void main(String[] args) {
        Scanner real1 = new Scanner(System.in);
        System.out.println("Enter first Real Number: ");
        int first_Number = real1.nextInt();
        Scanner real2 = new Scanner(System.in);
        System.out.println("Enter Second Real number: ");
        int Second_Number = real2.nextInt();
        Scanner img1 = new Scanner(System.in);
        System.out.println("Enter first img number: ");
        int first_img1 = img1.nextInt();
        Scanner img2 = new Scanner(System.in);
        System.out.println("Enter second img number: ");
        int Second_img2 = img2.nextInt();
        System.out.print(first_Number + Second_Number +"+");
        System.out.print(first_img1+Second_img2 +"i");


    }


}
