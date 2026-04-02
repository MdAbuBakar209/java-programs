package OOPs.java;

//Dynamic polymorshism
class Sample
{
  //method to add two values
  void add(int a, int b)
  {
    System.out.println("Sum of two="+ (a+b));
  }
  // method to add three variables
  void add(int a, int b, int c)
  {
   System.out.println("Sum of three="+(a+b+c));
  }
}
class One
{
  public static void main(String args[])
  {
    Sample s = new Sample();
    s.add(10,15);
    s.add(10,15,20);
   }
}

