
class TestDemo
{
    int a ,b;
    TestDemo(int a ,int b)
    {
        this.a=a;
        this.b=b;
    }
//    int a =20;
    void DemoTest() //Methods
    {
        System.out.println("Demo is Here");
    }
    void display() //Methods
    {
        this.DemoTest(); // this statement called your demotest Method with the help of "this" keyword
        System.out.println("Value of a is --"+this.a);
        System.out.println("Testing is Good");
    }

}

public class thisExample {
    public static void main(String[] args) {
        TestDemo t = new TestDemo(10,20); // object
        t.display(); // we just call the display method
    }
}
