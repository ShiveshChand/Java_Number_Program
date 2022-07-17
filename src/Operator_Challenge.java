public class Operator_Challenge {
    public static void main(String[] args) {
        double var1= 20.00d;
        double var2= 80.00d;
        double mytotalValle = var1+var2*100.00d;
        System.out.println("addition = "+ mytotalValle);
        double remainder = mytotalValle%40.00;
        System.out.println("remainder = " +remainder);
        boolean isreslt = (remainder==0)? true : false ;
        System.out.println("isreslt = "+isreslt);
        if (!isreslt){
            System.out.println("Got some remainder");
        }


    }
}
