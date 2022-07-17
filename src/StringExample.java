
class StringExample {
    public static void main(String[] args) {
        String s = "this is string";
        System.out.println("this is new String"+s);
        System.out.println(s.toUpperCase());
        System.out.println(s.concat("This line is very important"));
        s.concat(" Add this line"); // this line is not added because string is immutable ;
        System.out.println(s);
    }
}
