class CheckEvenOdd
{
    void Check()
    {
        for(int i = 1 ;i < 10; i++)
        {
            if(i%2==0)
            {
                System.out.println(i + "  is Even Number");
            }
            else
            {
                System.out.println(i +"  is Odd Numbers");
            }
        }
    }
}
public class EvenOddOther {
    public static void main(String[] args) {

        CheckEvenOdd c = new CheckEvenOdd();
        c.Check();

    }
}
