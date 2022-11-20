class p1
{
 public static void main(String args[])
  {
   int[] a=new int[5];
   int i;
   try
   {
    for(i=0;i<6;i++)
     a[i]=i;
   }
   catch(Exception e)
   {
    System.out.println(e);
   }
   
   for(i=0;i<5;i++)
    System.out.println(a[i]);
  }
}
