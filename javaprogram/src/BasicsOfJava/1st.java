class A 
{
int a; String name;
   A()
     { a = 5; name = Bakar;
}
 void show() 
{
  System.out.println(a+" "+name);
 }
}
class B 
{
public static void main(String [] args) 
{
A r = new A();
r.show();
}
}
