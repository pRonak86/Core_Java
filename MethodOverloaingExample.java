class DemoTest
{
    void display()
    {
        System.out.println("Default method");
    }
    void display(int a )
    {
        System.out.println("Integer Parameter Methods");
    }
}

public class MethodOverloaingExample {
    public static void main(String[] args) {
        DemoTest d = new DemoTest();
        d.display();
        d.display(10);
    }
}
