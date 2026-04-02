package OOPs;


//calling super class default constructor from sub class

class One
{
  //super class default constructor
  One()
  {
   System.out.println("One");
  }
}
class Two extends One
{
   //sub class default constructor
  Two()
  {
   System.out.println("Two");
  }

}
class Three extends Two 
{
   //sub class default constructor
  Three()
  {
   System.out.println("Three");
  }

}

class MultipleInheritence 
{
 public static void main(String args[])
 {
  //create sub class object
  Three t=new Three();
 }

}
