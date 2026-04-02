package OOPs;

//Inner Class
//This is outer class

import java.io.*;
class BankAcct
{
  //balance amount is the variable 
  private double balance;
  //initialize the balance
  BankAcct(double b)
  {
   balance=b;
  }
  //in this method, inner class object is created after verifying the authentication...
  // of user. r is the rate of interest 
  // this method accepts rate of interest r
  void contact(double r) throws IOException
  {
   // accept the password from keyboard and verify
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter password");
   String passwd=br.readLine();
   if(passwd.equals("xyz123"))
   {
    // if passwd is correct then calculate interest
    Interest in=new Interest(r);
    in.calculateInterest();
   }
   else
   {
     System.out.println("Sorry you are not an authorized person");
     return;
   }

   }
   //inner class
   private class Interest
   {
    //rate of interest
    private double rate;
    //initialize the rate
    Interest(double r)
    {
     rate=r;
    }
    // calculate interest amount and update balcnce
    void calculateInterest()
    {
      double interest=balance*rate/100;
      balance+=interest;
      System.out.println("Updated Balance="+balance);
    }
    }
}
//using inner class
class RelationRbo2
{
public static void main(String args[]) throws IOException
{
  //bank account is holding a balance of 10000
  BankAcct account=new BankAcct(10000);
   
  //update balance amount by adding interest at 9.5%
  account.contact(9.5);
}
}

