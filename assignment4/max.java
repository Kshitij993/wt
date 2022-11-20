class max
{
 public static void main(String a[])
  {
    int n1=Integer.parseInt(a[0]);
    int n2=Integer.parseInt(a[1]);
    int n3=Integer.parseInt(a[2]);
    int m;
    m= (n1>n2) ? n1 : n2;
    m= (m>n3) ? m : n3;
    System.out.println("max="+m);
   }
 }
