import java.util.Scanner;
class box
{
 int l,w,h;
 
 int volume()
  {
   return l*w*h;
  }
 void input()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("length : ");
   l=s.nextInt();
   System.out.println("Width : ");
   w=s.nextInt();
   System.out.println("Height : ");
   h=s.nextInt();
  }
 }
class demo
 {
  public static void main(String args[])
   {
    box b=new box();
    b.input();
    int v=b.volume();
    System.out.println("Volume : "+v);
   }
 }
