package OOPs;
//Relating Class Two with class One

class One
{
  //instance variable 
  int x;
  Two t; // Class Two's reference
  One(Two t)
  {
   //copy Two's reference into t
   this.t=t;
   x=10;
  }
  //methods to display class Two's variables
  void display()
  {
  System.out.println("One's x="+x);
  //call class Two's method 
  t.display();
  // Access class Two's variable
  System.out.println("Two's var="+t.y); 
  }

}
class Two
{
  //instance variable
  int y;
  int z;
  //initialize y
  Two(int y)
  {
    this.y=y;
    this.z=15;
  }
  //method to display
  void display()
  {
   System.out.println("Two's y="+y);
   System.out.println("Two's z="+z);
 
  }
}

class RelationRbo9
{
   public static void main(String args[])
   {
     //create object of class Two and store 22 there
     Two obj2=new Two(22);
     // create object of class One and pass it to object of class two
     One obj1=new One(obj2);
     //call class One's method 
     obj1.display();
   }

}
