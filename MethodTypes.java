
class MethodTest
{
//    void sum() // no return type no argument
//    void sum(int a,int b) // no return type with argument
//    int sum() // return type with no argument
    int sum(int a,int b) // return type with argument
    {
//        int a =10;
//        int b = 20;
        int c = a+b; // c = 30
        return c;
//        System.out.println(a+b);
    }
}

public class MethodTypes {
    public static void main(String[] args) {

        MethodTest m = new MethodTest();
        System.out.println(m.sum(500,800));
//        int s= m.sum();
//        System.out.println("Sum of two number "+s);

    }
}
