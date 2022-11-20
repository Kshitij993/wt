import java.util.Scanner;
class rectangle
{
 int l,b;
 void read()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Length= ");
   l=s.nextInt();
   System.out.println("Breadth= ");
   b=s.nextInt();
  }
 void calculate()
  {
   int p=2*(l+b);
   int a=l*b;
   System.out.println("Peremeter = "+p);
   System.out.println("Area = "+a);
  }
}
class calc
{
 public static void main(String args[])
  {
   rectangle r=new rectangle();
   r.read();
   r.calculate();
  }
}
