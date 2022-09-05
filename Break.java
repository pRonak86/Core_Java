public class Break {
    public static void main(String[] args) {
        label1:
        for(int i =0 ; i < 10 ; i++) // i=0 , i = 1 , i =5
        {
            if(i==5) // 5==5 T
            {
//                break;
//                continue;
                  break label1;
            }
            System.out.println("Value of i is --" + i);
        }
    }
}
