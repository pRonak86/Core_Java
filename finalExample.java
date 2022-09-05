public class finalExample {
    final int a =20;
    void display()
    {
//        a=40;
        System.out.println("Value of a is --"+a);
    }
    public static void main(String[] args) {

        finalExample f = new finalExample();
        f.display();

    }
}
