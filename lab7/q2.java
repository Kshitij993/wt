import java.util.Scanner;
interface motor
{
 int capacity=5;
 void run();
 void consume();
}
class washingMachine implements motor
{
 public void run()
  {
   System.out.println("Running time : 10hr");
  }
 public void consume()
  {
   System.out.println("Consumption : 15 KWH");
  }
 void put()
  {
   System.out.println("Capacity : "+capacity);
   run();
   consume();
  }
}
class q2
{
 public static void main(String args[])
  {
   washingMachine w = new washingMachine();
   w.put();
  }
}
 
