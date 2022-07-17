
// Java program to find largest of three Number 

public class Largest_Of_Three_Number {
    public static void main(String[] args) {
        int x , y , z ;
        x = 40 ;
        y = 15 ;
        z = 25 ;
        if(z>y && z>x ){
            System.out.println("Z is greater number");
        }
        else if (y>z && y>x ) {
            System.out.println("Y is greater Number");
            
        }
        else {
            System.out.println("X is Greater Number");
        }

    }
}
