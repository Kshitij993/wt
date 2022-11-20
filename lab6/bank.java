import java.util.Scanner;
class account
{
 int acc_no;
 int bal;
 void disp()
  {
   System.out.println("account no "+acc_no);
   System.out.println("balance "+bal);
  }
}
class person extends account
{
 String name;
 long addhaar;
 void input()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter name : ");
   name=s.next();
   System.out.println("Enter aadhaar : ");
   addhaar=s.nextLong();
   System.out.println("Enter account no : ");
   acc_no=s.nextInt();
   System.out.println("Enter balance : ");
   bal=s.nextInt();
  }
  void disp()
  {
   System.out.println("name "+name);
   System.out.println("aadhaar "+addhaar);
   super.disp();
  }
}
 
class bank
{
 public static void main(String args[])
  {
    int n;
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter the no of person to add ");
    n=s1.nextInt();
    person p[]=new person[n];
    int i;
    for(i=0;i<n;i++)
     {
      p[i]=new person();
      p[i].input();
     }
    for(i=0;i<n;i++)
     p[i].disp();
  }
}

