import java.util.Scanner;
class shape
{
 double area;
 void show()
  {
   System.out.println("Area = "+area);
  }
}
class rectangle extends shape
{
 int l,b;
 void input()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter length");
   l=s.nextInt();
   System.out.println("Enter bredth");
   b=s.nextInt();
  }
  void calcArea()
   {
    area=l*b;
    show();
   }
}
class circle extends shape
{
 int r;
 void input()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter radius");
   r=s.nextInt();
  }
  void calcArea()
   {
    area=r*r;
    show();
   }
}
class overload 
{
 public static void main(String args[]) 
 {
  circle c=new circle();
  c.input();
  c.calcArea();
  rectangle r=new rectangle();
  r.input();
  r.calcArea();
 }
}
