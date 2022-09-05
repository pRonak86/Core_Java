public class MaxThree {
    public static void main(String[] args) {

        int a = 100;
        int b = 2000 ;
        int c = 4000;
        if(a>b)
        {
            System.out.println("A is Greater then B");
            if(a>c)
            {
                System.out.println("A is Greater then C & B");
            }
            else
            {
                System.out.println("C is Greater then A & B");
            }
        }
        else
        {
            System.out.println("B is Greater then A");
            if(b>c)
            {
                System.out.println("B is Greater then  A & C");
            }
            else
            {
                System.out.println("C is Greater then A & B");
            }
        }
    }
}
