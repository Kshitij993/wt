import java.util.Scanner;
class number
{
 int n;
 int a[]= new int[n];
 void read()
 {
   int i,j;
   System.out.println("Enter size of array");
   Scanner s= new Scanner(System.in);
   n=s.nextInt();
   a=new int[n];
   for(i=0;i<n;i++)
    {
     a[i]=s.nextInt();
    }
 }
 void swap(int l,int b)
 {
   int t;
   b=b-1;
   t=a[l] ;
   a[l]=a[b];
   a[b]=t;
 }
 void sort()
 {
  int t,i,j;
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
 }
 void display()
 {
  int i;
  System.out.println();
   for(i=0;i<n;i++)
    System.out.print(a[i]+" "); 
 }
 public static void main(String args[])
  {  
   number r=new number();
   r.read();
   r.sort();
   r.swap(0,r.n);
   r.display();
  }
}
   
   
  
