package OOPs;

//Teacher class 
class Teacher
{
  //instance variables
  int id;
  String name;
  String address;
  float sal;
  // setter method to store id
  void setId(int id)
  {
   this.id=id;
  }
  //getter method to retrive id
  int getId()
  {
   return id;
  }
  // to store name
  void setName(String name)
  {
   this.name=name;
  }
  //to retrive name
  String getName()
  {
   return name;
  }
  // to store address
  void setAddress(String address)
  {
   this.address=address;
  }
  //to retreive address
  String getAddress()
  {
   return address;
  }
  // to store salary
  void setSal(float sal)
  {
   this.sal=sal;
  }
  //to retrieve salary
  float getSal()
  {
   return sal;
  }
}

//Using Student class
class Student extends Teacher
{
  // id, name, add are avialable from Teacher class, we omit those instance variables 
  //and corresponding methods
  int marks;
  //int id;
  //to store marks
  void setMarks(int marks)
  {
   this.marks=marks;
  }
  //to retrive marks
  int getMarks()
  {
   return marks;
  }

}
class InheritStudentTeacher
{
  public static void main(String args[])
  {
   //Teacher T=new Teacher();
   Student s=new Student();
   
   //store data into object - for this use setter methods
   s.setId(1000);
   s.setName("H.K. Maity");
   s.setAddress("Kolkata-38");
   s.setMarks(950);
   //retrieve data using getter methods and display
   System.out.println("ID="+s.getId());
   System.out.println("Name="+s.getName());
   System.out.println("Address="+s.getAddress());
   System.out.println("Marks="+s.getMarks());
  }

}

