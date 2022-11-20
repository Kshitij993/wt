class p2
 {
  public static void main(String args[])
   {
    try
    {
    int a[] = new int[5];
    a[3]=30;
    a[7]=40/0;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
     System.out.println("Array Exception");
    }
    catch(Exception e)
    {
     System.out.println(e);
    }
   }
 }
    
