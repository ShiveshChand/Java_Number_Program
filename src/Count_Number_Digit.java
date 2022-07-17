import java.util.Scanner;

public class Count_Number_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
        int num = 1115;
        int count = 0 ;
        for(int i=0; ; i++){
            if(num!=0) {
                num = num / 10;
                count++;
            }
            if(num==0)
            {
               break;
            }
////            System.out.println("Number of digits: " +count);
        }
        System.out.println("Number of digits: " +count);

//        int num = 1115;
//        int count=0;
//        for(int i=1; ;i++)
//        {
//            int result = num/10; //1115 result=111,11,1,0
//            num = result;// num=111,11,1,0
//            count++; // 1,2,3,4
//            if(num==0)
//            {
//                break;
//            }
//
//        }
//        System.out.println(count);

    }
}
