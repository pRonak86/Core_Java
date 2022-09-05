public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer s1=new StringBuffer("A");
        StringBuffer s2 = new StringBuffer("B");
        s1.append(s2);
        System.out.println(s1);
    }
}
