class test
{
 static int c=0;
 test()
  {
   c++;
  }
}
class object
{
 public static void main(String args[])
  {
   test t=new test();
   test t2=new test();
   test t3=new test();
   test t4=new test();
   System.out.println(t4.c);
  }
}
