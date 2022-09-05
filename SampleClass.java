class Human
{
    int a = 10;
    void running()
    {
        System.out.println("very Fast");
    }
}



public class SampleClass {
    public static void main(String[] args) {
        // we have to create a object and then we can call the methods which is inside human class.
        // className ReferenceVariable = new className();
        Human Ronak = new Human();
        //to call that we can use . Operator
        Ronak.running();
        System.out.println(Ronak.a);

        Human vidhi = new Human();
        vidhi.running();
    }
}
