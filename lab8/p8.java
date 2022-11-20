class stack
 {
  int a[] = new int[5];
  int top=-1;
  void push(int n)
   {
    try
    {
     if(top<4)
      {
       top++;
       a[top]=n;
      }
     else
       throw new Exception("Stack Overflow");
    }
    catch(Exception e)
     {
      System.out.println(e);
     }
   }
  void pop()
   {
     try
      {
       if(top==-1)
        throw new Exception("Stack Underflow");
       else
        top--;
      }
      catch(Exception e)
       { 
        System.out.println(e);
       }
   }
   void display()
    {
     int i;
     for(i=top;i>=0;i--)
       System.out.print(a[i]+" ");
     System.out.println();
    }
 }
 class p8
 {
  public static void main(String args[])
   {
    stack s=new stack();
    int i;
    for(i=0;i<6;i++)
     {
       System.out.println("Element pushed :"+i);
       s.push(i);
       System.out.println("Stack status");
       s.display();
     }
     for(i=0;i<6;i++)
     {
       System.out.println("Element poped");
       s.pop();
       System.out.println("Stack status");
       s.display();
     }
   }
 }
