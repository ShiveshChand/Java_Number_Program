public class ReverseInteger {
    public static void main(String[] args) {
        int n=123;
        int rev=0;

        for (int i = 1;  ;i++) {

            int rem = n%10; //3 2 1 12%10=2, 1%10=1
//            rev = rev*10 +rem; // this is the idea to find reverse
            rev=rev*10; // rev*10+rem 0+3=3
            rev=rev+rem;
            n=n/10;
            if(n==0)
                break;
        }
        System.out.println(rev);
    }
}
