import java.util.Scanner;

class MyException extends Exception
{
    MyException(String s) // constructor --OF current class with String argument
    {
        super(s); // Exception(s)
    }
}
public class CustomeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        try {
            if(age<18)
            {
                throw new MyException("You are not Eligible");
            }
            else {
                System.out.println("Congratulation ...");
            }
        }
        catch (MyException e)
        {
            System.out.println(e);
        }


    }
}
