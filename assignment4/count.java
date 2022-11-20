class count
{
 public static void main( String a[])
  {
   int i,e=0,o=0;
   for(i=0;i<a.length;i++)
    {
     if((Integer.parseInt(a[i]))%2==0)
      e=e+1;
     else
      o=o+1;
    }
   System.out.println("No of odd= "+o);
   System.out.println("No of even= "+e);
  }
}
   
