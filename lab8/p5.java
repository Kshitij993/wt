import java.util.Scanner;

class time
{
 int hr,ms,se;
 void input()
  { 
    Scanner s=new Scanner(System.in);  
    System.out.print("Enter hour : ");
    hr=s.nextInt();
    System.out.print("Enter minute : ");
    ms=s.nextInt();
    System.out.print("Enter second : ");
    se=s.nextInt();
  }
 void heCheck(int h)
  {
   try
    {
     if(h>24 || h<0)
      {
       throw new Exception("HrsException");
      }
    }
   catch(Exception e)
    { 
      System.out.println(e);
    }
  }   
 void msCheck(int m)
  {
   try
    {
     if(m>60 || m<0)
      {
       throw new Exception("MinException");
      }
    }
   catch(Exception e)
    { 
      System.out.println(e);
    }
  }   
 void seCheck(int sec)
  {
   try
    {
     if(sec>60 || sec<0)
      {
       throw new Exception("SecException");
      }
    }
   catch(Exception e)
    { 
      System.out.println(e);
    }
  } 
}
class p5
 {
  public static void main(String args[])
   {
    int i;
    time t1= new time();
    t1.input();
    t1.heCheck(t1.hr);
    t1.msCheck(t1.ms);
    t1.seCheck(t1.se);
   }
 }
      
