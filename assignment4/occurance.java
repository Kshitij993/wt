import java.util.Scanner;
class occurance
{
 public static void main(String args[])
  {
   int i,j,n,c;
   System.out.println("Enter size of array : ");
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   int a[]=new int[n];
   for(i=0;i<n;i++)
    {
     Scanner s1=new Scanner(System.in);   
     a[i]=s1.nextInt();
    }
   for(i=0;i<n;i++)
    {
     c=0;
     for(j=0;j<n;j++)
      {
       if(a[i]==a[j])
         c++;
      }
     System.out.println(a[i]+"--"+c);
    }
  }
}
