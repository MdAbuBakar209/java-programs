package OOPs;

//Private and protected
class Access
{
 protected int a=2;
 protected int b=3;
}
class Sub extends Access
{
 public void get()
 {
   System.out.println(a); 
   System.out.println(b);
 }
}

class inheritTest
{
 public static void main(String args[])
 {
   Sub s= new Sub();
   s.get();
 }
}

class Test
{
 public static void main(String args[])
 {
   Sub s= new Sub();
   s.get();
 }
}

