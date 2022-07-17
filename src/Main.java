public class Main {
    public static void main(String[] args) {
        char myCode= 'D';
        char myUnicode = '\u0044';  //D
        char myCopyright = '\u00A9';    //©
        char myCopyR='©';
        int dSymbol = myCode; //
        int cRight = myCopyR;   //
        System.out.println(myCode+"\n"+myUnicode +"\n"+myCopyright+ "\n"+dSymbol+"\n"+cRight);

    }
}