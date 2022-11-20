import java.util.Scanner;
class dimension
{
 void area(int l,int b)
  {
   int a=l*b;
   System.out.println("Area of rectangle = "+a);
  }
 void area(int r)
  {
   double a;
   a=3.14*r*r;
   System.out.println("Area of circle= "+a);
  }
 void area(double b,double h)
  {
   double a;
   a=0.5*b*h;
   System.out.println("Area of triangle= "+a);
  }
}
class compute
{
 public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   dimension x=new dimension();
   int ch;
   do
   {
    System.out.println("1-rectangle  \n2-Circle \n3-triangle\n4-end");
    System.out.println("Enter choice : ");
    ch=s.nextInt();
    if(ch==1)
     {
      int a,b;
      a=s.nextInt();
      b=s.nextInt();
      x.area(a,b);
     }
     if(ch==2)
      {
       int a;
       a=s.nextInt();
       x.area(a);
      }
     if(ch==3)
      {
       double c,d;
       c=s.nextDouble();
       d=s.nextDouble();
       x.area(c,d);
      }
   }while(ch<4);
   
  }
}
  
   
   
   
