public class TwoDimensionArray {
    public static void main(String[] args) {

        // int[row][column] ==> 3 - row , 4 -- Column ==. 12
        int[][] a = new int[3][4];

        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[0][3]=40;
        a[1][0]=50;
        a[1][1]=60;
        a[1][2]=70;
        a[1][3]=80;
        a[2][0]=90;
        a[2][1]=100;
        a[2][2]=110;
        a[2][3]=120;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(a[i][j]);
            }
        }


    }
}
