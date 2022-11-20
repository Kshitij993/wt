class p6
 {
  public static void main(String args[])
   {
    try
     {
      if(args.length<4)
       throw new Exception("Check Argument Exception");
      else
       {
        int s=0,a;
        for(int i=0;i<args.length;i++)
          {
            a=Integer.parseInt(args[i]);
            s=s+a*a;
          }
        System.out.println("Sum of Square = "+s);
       }
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
   }
 }
    
