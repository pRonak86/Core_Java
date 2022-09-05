class SampelTest
{
    int x ;
    int y;
    SampelTest(int a, int b)  // local variable -->
    {
//        x=a;
//        y=b;
        System.out.println("Value of a --"+a);
        System.out.println("Value of b --"+b);

    }
//    void sum()
//    {
//        int c = x+y;
//        System.out.println("Sum of Two Number --"+c);
//
//    }
//    int a = 10; // default value of outside the class variable
}
// to pass value of class variable on run time we use constructor

public class SampleContructor {
    public static void main(String[] args) {

        SampelTest s = new SampelTest(10,20); // this statement is execute at that moment our construtor is automically
        //called
//        s.sum();
        SampelTest s1 = new SampelTest(500,400);
//        s1.sum();
    }
}
