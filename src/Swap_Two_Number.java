public class Swap_Two_Number {
    public static void main(String[] args) {

 //  Swapping Two Number Without Using third variable

//        int a = 5 ;
//        int b = 4 ;
//        a = a+b ;  // a = 5+4 = 9
//        b = a-b ;  // b = 9-4 = 5
//        a = a-b ;  // a = 9-5 = 4
//        System.out.println("a become: "+a);
//        System.out.println("b become: "+b);
        int x = 5;

        int y = 4;

        y= x+y - (x=y);//5+4 - (4)

        System.out.println("After swaping:"+ " x = " + x + ", y = " + y);

 //   Swapping Two Number Using Third Variable
    }
}
