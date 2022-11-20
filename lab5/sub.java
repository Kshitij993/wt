class difference
{
 int subtract(int a,int b)
  {
   return a-b;
  }
 double subtract(double a,double b)
 {
  return a-b;
 }
}
class sub
 {
  public static void main(String args[])
   {
   difference d=new difference();
   int a=5;
   int b=6;
   double c=5.5;
   double e=3.3;
   int dif=d.subtract(b,a);
   System.out.println("difference="+dif);
   double diff=d.subtract(c,e);
   System.out.println("difference="+diff);
  }
}
