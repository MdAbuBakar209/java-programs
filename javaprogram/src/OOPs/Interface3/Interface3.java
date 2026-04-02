package OOPs.Interface3;

public class Interface3 {

}
interface Printable{  
    void print();  
    }  
    interface Showable extends Printable{  
    void show();  
    }  
    class MainC implements Showable{  
    public void print()
    {
    System.out.println("Hello");
    }  
    public void show()
    {
    System.out.println("Welcome");
    }  
      
    public static void main(String args[]){  
    MainC obj = new MainC();  
    obj.print();  
    obj.show();  
     }  
    }  
    