public class Try_Catch_Finally {
    public static void main(String[] args) {

        System.out.println("Statement - 1 ");
        try { //outside try
            System.out.println("Statement - 1 A");
            try { //inside try
                System.out.println(10/0);
            }
            catch (ArithmeticException e )
            {
                System.out.println(10/0);
            }
            finally {
                System.out.println("Statement - 2");
                try
                {
                    System.out.println("Statement - 2AA");
                }
                catch (ArithmeticException ae)
                {
                    System.out.println(10/0);
                }
                finally {
                    System.out.println("Statement - 2AC");
                }
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Statement - 2 A");
        }
        finally {
            System.out.println("Statement - 3");
        }
        System.out.println("Statement - 4");

    }
}
