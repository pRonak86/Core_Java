class GrandParents
{
    void display()
    {
        System.out.println("Method forom Grand Parents");
    }
}
class Parent extends GrandParents
{
    void test()
    {
        System.out.println("Test from Parent Class is Called");
    }
}
class Child extends Parent
{

}
class  Child1 extends Parent
{

}

public class MultiLevelINheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.test();
        Parent p = new Parent();
        p.display();
        Child1 c2 = new Child1();
        c2.test();
    }
}
