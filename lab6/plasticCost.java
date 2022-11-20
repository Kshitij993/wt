import java.util.Scanner;
class twoD
{
  int rate2d=40;
  int cost2D;
  void compute2D(int a)
   {
     cost2D=a*rate2d;
   }
}
class threeD extends twoD
{
  int rate3d=60;
  int cost3D;
  int val;
  void compute3D(int v)
  {
   cost3D=v*rate3d;
  }
  void dis3D()
  {
   System.out.println("cost="+cost3D);
  }
  void dis2D()
  {
   System.out.println("cost="+cost2D);
  }
  void input()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("What you want to buy \n 1-Sheet \n 2-Box \n Enter your choice ");
    int ch;
    ch=s.nextInt();
    if(ch==1)
     {
      System.out.println("Enter area of sheet in square ft");
      val=s.nextInt();
      compute2D(val);
      dis2D();
     }
    if(ch==2)
     {
       System.out.println("Enter volume of box in cubic ft");
       val=s.nextInt();
       compute3D(val);
       dis3D();
     }
  }
}
class plasticCost
{
 public static void main(String args[])
 {
  threeD o=new threeD();
  o.input();
 }
}
