interface demoInterface
{
    void display(); // declaration --> method overriding

}
interface demoInterface1
{
    void display();
    void show(String s );
    void sum(int a ,int b);
}
class TestInterface implements demoInterface,demoInterface1
{
    public void show(String s )
    {
        System.out.println(s);
    }
    public void display() {
        System.out.println("display from TestInterface");
    }

    public void sum(int a ,int b)
    {
        System.out.println(a+b);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        t.display();
        t.sum(10,20);
    }
}
