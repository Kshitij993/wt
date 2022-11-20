import java.util.Scanner;
class dimension_area
{
 void areas(int l_1905514)
  {
   int a_1905514=l_1905514*l_1905514;
   System.out.println("Area of square = "+a_1905514);
  }
 void areas(int r_1905514, double pi_1905514)
  {
   double a_1905514;
   a_1905514=pi_1905514*r_1905514*r_1905514;
   System.out.println("Area of circle= "+a_1905514);
  }
 void areas(double b_1905514,double h_1905514)
  {
   double a_1905514;
   a_1905514=0.5*b_1905514*h_1905514;
   System.out.println("Area of triangle= "+a_1905514);
  }
}
class compute_area
{
 public static void main(String args[])
  {
   Scanner s_1905514=new Scanner(System.in);
   dimension_area x_1905514=new dimension_area();
   int ch_1905514;
   System.out.println("Name: Kshitij Kumar Sharma   Roll: 1905514    Section: CS8");
   do
   {
    System.out.println("1-square  \n2-Circle \n3-triangle\n4-end");
    System.out.println("Enter choice : ");
    ch_1905514=s_1905514.nextInt();
    if(ch_1905514==1)
     {
      int a_1905514;
      a_1905514=s_1905514.nextInt();
      x_1905514.areas(a_1905514);
     }
     if(ch_1905514==2)
      {
       int a_1905514;
       a_1905514=s_1905514.nextInt();
       x_1905514.areas(a_1905514,3.14);
      }
     if(ch_1905514==3)
      {
       double c_1905514,d_1905514;
       c_1905514=s_1905514.nextDouble();
       d_1905514=s_1905514.nextDouble();
       x_1905514.areas(c_1905514,d_1905514);
      }
   }while(ch_1905514<4);
   
  }
}
  
   
   
   
