class plate
{
 int l,b;
 plate()
 {
  l=0;
  b=0;
  System.out.println("plate default"+"l="+l+" b="+b);
 }
 plate(int a,int b)
 {
  l=a;
  b=b;
  System.out.println("plate parameter "+"l="+l+" b="+b);
 }
}
class box extends plate
{
 int h;
 box()
 {
  l=0;
  b=0;
  h=0;
  System.out.println("box default"+"l="+l+" b="+b+" h="+h);
 }
  box(int a,int b,int c)
 {
  l=a;
  b=b;
  h=c;
  System.out.println("box default"+"l="+l+" b="+b+" h="+h);
 }
 
}
class wbox extends box
{
 int w;
 wbox()
 {
  l=0;
  b=0;
  h=0;
  w=0;
  System.out.println("wbox default"+"l="+l+" b="+b+" h="+h+" w="+w);
 }
  
  wbox(int a,int b,int c,int d)
 {
  l=a;
  b=b;
  h=c;
  w=d;
  System.out.println("wbox parameter "+"l="+l+" b="+b+" h="+h+" w="+w);
 }
 
}
class constructor
{
 public static void main(String args[])
 {
   wbox d=new wbox();
   wbox d1= new wbox(1,2,3,4);
 }
}

