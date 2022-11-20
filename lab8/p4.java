import java.util.Scanner;
class p4
 {
  public static void processInput(double n)
   {
     try
     {
      if(n>=0)
       System.out.println(n);
      else
       throw new Exception("NegativeNumberException");
     }
     catch(Exception e)
      {
       System.out.println(e);
      }
   }
 public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);  
    int i;
    double n;
    System.out.println("Enter number: ");
    for(i=0;i<3;i++)
     {
      n=s.nextDouble();
      processInput(n);
     }
  }
}
