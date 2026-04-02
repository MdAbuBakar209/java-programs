package OOPs;

//bydefault sub class members are accesssible to sub class object

class One
{
  //super class var
  int i=10;
  //super class method 
  void show()
  {
   System.out.println("Super class method:i="+i);
  }
}
class Two extends One
{
  //sub class var
  int i=20;
  //sub class method
  void show()
  {
   System.out.println("Sub class method:i="+i);
  } 

}

class InheritSuper1
{
 public static void main(String args[])
 {
  //create sub class object
  Two t=new Two();
  //This will call sub class method only
  t.show();

 }

}
