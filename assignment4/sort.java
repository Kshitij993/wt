import java.util.Scanner;
class sort
{
 public static void main(String args[])
  { 
   int n,i,j,t;
   System.out.println("Enter size of array");
   Scanner s= new Scanner(System.in);
   n=s.nextInt();
   int a[]= new int[n];
   for(i=0;i<n;i++)
    {
     Scanner s1= new Scanner(System.in);
     a[i]=s1.nextInt();
    }
   for(i=0;i<n;i++)
    {
     for(j=0;j<n-1;j++)
      {
       if(a[j]>a[j+1])
        {
         t=a[j];
         a[j]=a[j+1];
         a[j+1]=t;
        }
      }
    }
   System.out.println();
   for(i=0;i<n;i++)
    System.out.print(a[i]+" "); 
  }
}
   
   
  
