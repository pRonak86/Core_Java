public class StringDemo {
    public static void main(String[] args) {

        String s = "Java Programming";
        System.out.println(s);

        String s1 = new String("The Best Programming Language");
        System.out.println(s1);
        System.out.println("Length is ="+s1.length());
        System.out.println("Character index ="+s1.charAt(4));
        System.out.println("Upper Case ="+s1.toUpperCase());
        System.out.println("Index of Character = "+s1.indexOf("Best"));
        String s2 ="A";
        String s3 = "A";
        System.out.println(s3.compareTo(s2)); // A . COmpareto(C) // E .Compare(A);
        System.out.println(s2.compareToIgnoreCase(s3));
        String s4 = s2.concat(s3);
        System.out.println(s4); // AB --> A
        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
        String[] sa=s1.split(" ");
        for(int i = 0;i<sa.length;i++)
        {
            System.out.println(sa[i]);
        }

    }
}

