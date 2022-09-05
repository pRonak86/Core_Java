public class Palindrom {
    public static void main(String[] args) {

        int n = 121;
        int sum = 0 ; // 654
        int reminder;
        int temp = n;
        while(n>0)
        {
            reminder = n%10;
//            System.out.println("Reminder is --"+reminder);
            sum = sum*10+reminder; // sum = sum+reminder*reminder*reminder;
//            System.out.println("Value of sum --"+sum);
            n= n/10;
        }
//        System.out.println("Value of n is --"+n);
//        System.out.println("Reverse Number is "+sum);
//        System.out.println("Temp Variable value "+temp);
        if(temp==sum)
        {
            System.out.println("Palindrom Number");
        }
        else
        {
            System.out.println("Not Palindrom Number");
        }

    }
}
