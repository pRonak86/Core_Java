abstract class DemoAbstract
{
    void display() // non- Abstract Method
    {
        System.out.println("Display is Called");
    }
    abstract void demodisplay();  // abstract Method
}
class ChildD extends DemoAbstract
{
    private int a =20;
    void demodisplay()
    {
        System.out.println("Demo Display is Called");
    }
}

public class abstractSample {
    public static void main(String[] args) {
        ChildD d = new ChildD();
        d.demodisplay();
        d.display();
//        System.out.println("Value of a is --");


    }
}
