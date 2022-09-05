class SumTwo
{
    int a = 10;
    int b =20;
    void sum()
    {
        int c = a +b ;
        System.out.println("Sum of Two nUmber is -- "+c);
    }
    void sub()
    {
        int c = a  - b ;
        System.out.println("Subtraction of Two nUmber is -- "+c);
    }
    void mul()
    {
        int c = a  * b ;
        System.out.println("Multiplication of Two nUmber is -- "+c);
    }
}

public class SumOfTwoNumber {
    public static void main(String[] args) {

        SumTwo s = new SumTwo();
        s.sum();
        s.sub();
//        s.mul();
    }
}
