public class elseIfLadder {
    public static void main(String[] args) {

        int a = 1000 ;
        int b = 200;
        int c = 30;

        if(a>b && a>c)
        {
            System.out.println("A is Greater then B and C");
        }
        else if(b>c)
        {
            System.out.println("B is Greater then A & C");
        }
        else
        {
            System.out.println("C is Greater then A & B ");
        }
    }
}
