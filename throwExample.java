public class throwExample {
    public static void main(String[] args) {
//        System.out.println(10/0); // -->JVM--> DEH -> Information
        // DEH-> Information
        throw new ArithmeticException("This is not Possible");
    }
}
