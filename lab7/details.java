import java.util.Scanner;
abstract class student
{
 int roll,reg;
 public abstract void course();
 public void input()
  {
   Scanner s=new Scanner(System.in);
   System.out.print("Roll : ");
   roll=s.nextInt();
   System.out.print("Reg : ");
   reg=s.nextInt();
  }
}
class kittian extends student
{
 public void course()
  {
    System.out.println("course : CSE");
  }
 void display()
  {
   System.out.println("Roll : "+roll);
   System.out.println("reg : "+reg);
   course();
  }
}
class details
{
 public static void main(String args[])
 {
  kittian c = new kittian();
  c.input();
  c.display();
 }
}
