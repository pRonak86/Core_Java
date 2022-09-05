public class ArrayExample {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = 40;
        int d =50;

        System.out.println(a + "    "+ b + "  "+c + "     "+d  );


        int[] k = new int[3]; // 3 is lentgh of array

        k[0] = 20;
        k[1] = 30;
        k[2] = 40;

        System.out.println(k[5]); //recoverable
//        k[3] = 50;

        System.out.println(k[0] + "    "+ k[1] + "  "+ k[2]   );
        //for (int i =0 ;i <3;i++)
        for(int i =0 ;i<k.length;i++) // i=0 ,i=1 , i=2 , i=3 3<3 False
        {
            System.out.println(k[i]); // k[0] , k[1] , k[2]
        }




    }
}
