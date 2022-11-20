import java.util.Scanner;
class student
{
 int roll;
 String name;
 double cgpa;
 
 void read()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Name= ");
   name=s.nextLine();
   System.out.println("Roll no = ");
   roll=s.nextInt();
   System.out.println("cgpa = ");
   cgpa=s.nextDouble();
  }
 void display()
  {
   System.out.println("Roll no = "+roll);
   System.out.println("Name = "+name);
   System.out.println("cgpa = "+cgpa);
  }
 double retcgpa()
  {
   return cgpa;
  }
}
class details
{
 public static void main(String args[])
  {
   int n,i;
   System.out.println("No of students to add : ");
   Scanner s1=new Scanner(System.in);
   n=s1.nextInt();
   student a[]=new student[n];
   for(i=0;i<n;i++)
    {
      a[i]=new student();
      a[i].read();
    }
  for(i=0;i<n;i++)
    a[i].display();
  double c=a[0].retcgpa();
  int p=-1;
  for(i=0;i<n;i++) 
    {
    if(c>=a[i].retcgpa())
      {
      c=a[i].retcgpa();
      p=i;
      }
    }
    System.out.println("details of Student with minimum cgps ");
    a[p].display();
  }
} 
