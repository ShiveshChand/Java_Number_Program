import java.util.Scanner;

public class TCS_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Please Enter Tire " );
        int Total_Tire = sc.nextInt();
        int veh = sc.nextInt() ;
        int x=0,y=0;

        y=(Total_Tire-2*veh)/2;
        x=veh-y;
        System.out.println("Total Number of bike: "+x);
        System.out.println("Total Number Of cars: " +y);

    }
}
