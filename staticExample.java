public class staticExample {

    static int a =20;
    static void display()
    {
        System.out.println("Display is Called");
    }
    static
    {
        System.out.println("Static Block");
    }
    public static void main(String[] args) {

        System.out.println("Value of a is --"+a);
        display();

//        staticExample s = new staticExample();
//        s.display();
    }
}
