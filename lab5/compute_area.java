import java.util.Scanner;
class dimension_area
{
 void areas(int l)
  {
   int a=l*l;
   System.out.println("Area of square = "+a);
  }
 void areas(int r, double pi)
  {
   double a;
   a=pi*r*r;
   System.out.println("Area of circle= "+a);
  }
 void areas(double b,double h)
  {
   double a;
   a=0.5*b*h;
   System.out.println("Area of triangle= "+a);
  }
}
class compute_area
{
 public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   dimension_area x=new dimension_area();
   int ch;
   do
   {
    System.out.println("1-square  \n2-Circle \n3-triangle\n4-end");
    System.out.println("Enter choice : ");
    ch=s.nextInt();
    if(ch==1)
     {
      int a;
      a=s.nextInt();
      x.areas(a);
     }
     if(ch==2)
      {
       int a;
       a=s.nextInt();
       x.areas(a,3.14);
      }
     if(ch==3)
      {
       double c,d;
       c=s.nextDouble();
       d=s.nextDouble();
       x.areas(c,d);
      }
   }while(ch<4);
   
  }
}
  
   
   
   
