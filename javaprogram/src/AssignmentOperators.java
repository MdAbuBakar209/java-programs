public class AssignmentOperators {
    public static void main(String[] args) {
        int a=20;
        int b;
        // =
        b=a;
        System.out.println(b);// 20

        // +=
        a +=b;// a=a+b,a=20+20
        System.out.println(a);// 40

        // -=
        a -= b;// a=a-b,a=40-20=20
        System.out.println(a);// 20

        // *=
        a *=b;//a=a*b;a=20*20=400
        System.out.println(a);//400

        // /=
        a /= b; // a=a/b;a=400/20=20
        System.out.println(a);//20

    }

}
