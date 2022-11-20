class a
{
 a()
 {
  System.out.println("one");
 }
 a(int i)
 {
  System.out.println("one param"+i);
 }
 
}

class b extends a
{
 b()
 {
  super();
  System.out.println("two");
 }
 
b(int i)
 {
  super(i);
  System.out.println("2 "+i);
 }
}

class compute 
{
 public static void main(String args[])
  {
   b b1=new b(10);
   b b2=new b();
  }
}
