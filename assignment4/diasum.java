import java.util.Scanner;
class diasum
{
 public static void main(String args[])
  {
   int i,j,r,c;
   System.out.println("Enter row size : ");
   Scanner s= new Scanner(System.in);
   r=s.nextInt();
   System.out.println("Enter column size : ");
   c=s.nextInt();
   int a[][]=new int[r][c];
   for(i=0;i<r;i++)
    {
     for(j=0;j<c;j++)
      {
       a[i][j]=s.nextInt();
      }
    }
   int s1=0,s2=0;
   for(i=0;i<r;i++)
    {
     for(j=0;j<c;j++)
      {
       if(i==j)
        s1=s1+a[i][j];
       if(i+j==r-1)
        s2=s2+a[i][j];
      }
    }
   System.out.println("left dia = "+s1);
   System.out.println("right dia = "+s2);
  }
}
   
