public class UnaryOperator {
    public static void main(String[] args) {
        // int a=5;
        // int b=a++;
        // int c=++a;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        int s = 5,r = 5;
        System.out.println(s++);//5
        System.out.println(s);//6

        System.out.println(++r);//6
        System.out.println(r);//6

        int x =s++;
        int y=++r;
        System.out.println(x);//6
        System.out.println(y);//7

        System.out.println(s);//7
        System.out.println(r);//7
    }

}
