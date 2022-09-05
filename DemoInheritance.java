class SuperClass
{
    // Variables , Methods , Constructors
    void display()
    {
        System.out.println("Display From Super Class");
    }
}
class SuperClass1
{

}
class subClass extends SuperClass
{

}

// Main Class -->
public class DemoInheritance {
    public static void main(String[] args) {
        subClass s = new subClass();
        s.display();
    }
}
