class account
 {
  int bal;
  account()
   {
    bal=500;
   }
  void deposit(int n)
   {
    bal=bal+n;
   }
  void widthraw(int n)
   {
    System.out.println("widthdrawl amount = "+n);
    try
     {
      if(bal-n<500)
       throw new Exception("LessBalanceException");
      else
       {
         bal=bal-n;
       }
     }
    catch(Exception e)
     { 
     System.out.println(e);
     }
   }
  void display()
   {
    System.out.println("balance = "+bal);
   }    
 }
class p7
 {
  public static void main(String args[])
   {
    account a=new account();
    a.display();
    a.deposit(1000);
    a.display();
    a.widthraw(1000);
    a.display();
    a.widthraw(100);
    a.display();
  }
  
 }
  
