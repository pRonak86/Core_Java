public class ExceptionExample {
    public static void main(String[] args) {
        doMoreStuff();
    }
    static void doMoreStuff()
    {
        moreStuff();
    }
    static void moreStuff()
    {
        System.out.println("Statement - 1");
        try {
            System.out.println(10 / 0); // Exception -->
        }
        catch (Exception e)
        {
            System.out.println(10/2);
        }
        System.out.println("Statement- 2");
    }
}
