public class LogicalOperators {
    public static void main(String[] args) {
        int a=15,b=10,c=20;
        // && operator
        System.out.println((a>b) && (a>c));//false
        System.out.println((a>b) && (a<c));// true
        
        // || operator
        System.out.println((c<b) || (a<b));// false
        System.out.println((a>b) || (a>c));// true
        System.out.println((a>b) || (b>c));// true
        // ! operator
        System.out.println(!(a==b));// true
        System.out.println(!(a>b));// false
        System.out.println(!(c==b));// true
    }
}
