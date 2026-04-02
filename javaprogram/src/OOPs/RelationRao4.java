package OOPs;

//Creating a push button and providing action to it
import java.awt.*;
import java.awt.event.*;
class RelationRao4 extends Frame
{
    RelationRao4()
 {
  //create a push button b
  Button b=new Button("OK");
  //add push button to frame 
  add(b);
  // action listener to button 
  //MyClass is implementation class of ActionListener interface
  b.addActionListener(new Myclass()); 
  }
  public static void main(String args[])
  {
    //create a frame by creating But class object
    RelationRao4 obj=new RelationRao4();
    //set the size of frame to width: 400 px and height: 300px
    obj.setSize(400,300);
    //display the frame
    obj.setVisible(true);
  }
}

//Myclass should implement the methods of ActionListener
class Myclass implements ActionListener
{
  // this method is executed when button is clicked
  public void actionPerformed(ActionEvent ae)
  {
   //exit the application
   System.exit(0);
  }
} 

