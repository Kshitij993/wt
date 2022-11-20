import java.util.Scanner;
class account
{
 int acc_no_1905514;
 int bal_1905514;
 void disp()
  {
   System.out.println("account no "+acc_no_1905514);
   System.out.println("balance "+bal_1905514);
  }
}
class person extends account
{
 String name_1905514;
 long addhaar_1905514;
 void input()
  {
   Scanner s_1905514=new Scanner(System.in);
   System.out.println("Enter name : ");
   name_1905514=s_1905514.next();
   System.out.println("Enter aadhaar : ");
   addhaar_1905514=s_1905514.nextLong();
   System.out.println("Enter account no : ");
   acc_no_1905514=s_1905514.nextInt();
   System.out.println("Enter balance : ");
   bal_1905514=s_1905514.nextInt();
  }
  void disp()
  {
   System.out.println("name "+name_1905514);
   System.out.println("aadhaar "+addhaar_1905514);
   super.disp();
  }
}
 
class bank
{
 public static void main(String args[])
  {
    int n_1905514;
    Scanner s1_1905514=new Scanner(System.in);
    System.out.println("Enter the no of person to add ");
    System.out.println("Name : Kshitij Kumar Sharma   roll: 1905514   section: CS8");
    n_1905514=s1_1905514.nextInt();
    person p_1905514[]=new person[n_1905514];
    int i_1905514;
    for(i_1905514=0;i_1905514<n_1905514;i_1905514++)
     {
      p_1905514[i_1905514]=new person();
      p_1905514[i_1905514].input();
     }
    for(i_1905514=0;i_1905514<n_1905514;i_1905514++)
     p_1905514[i_1905514].disp();
  }
}

