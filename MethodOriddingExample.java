class ParentM
{
    void display(int a ) {
        System.out.println("Parent Methdo Called");
    }
}
// you can execute your methods with different Statements
class ChildM extends ParentM
{
    void display(int a) {
        System.out.println("Child Method Called");
    }
}
public class MethodOriddingExample {
    public static void main(String[] args) {

        ChildM c = new ChildM();
        c.display(10);

        ParentM p = new ParentM();
        p.display(10);

    }
}
