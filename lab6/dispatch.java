class a
{
 void show()
 {
   System.out.println("class A");
 }
}
class b extends a
{
 void show()
 {
   System.out.println("class B");
 }
}
class c extends b
{
 void show()
 {
   System.out.println("class C");
 }
}
class dispatch
{
public static void main(String args[])
 {
  a r1;
  a a1=new a();
  b b1=new b();
  c c1=new c();
  r1=a1;
  r1.show();
  r1=b1;
  r1.show();
  r1=c1;
  r1.show();
 }
}
