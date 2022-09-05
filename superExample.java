class ParentP
{
    void display()
    {
        System.out.println("Parent Method is Called");
    }
}
class ChildC extends  ParentP
{
    void demo()
    {
        super.display(); // you can use to call method of parent
        // you can call variable of parent
        // you can call constructor of Parent
        System.out.println("Demo is called");
    }
}

public class superExample {
    public static void main(String[] args) {
        ChildC c = new ChildC();
        c.demo();
    }
}
