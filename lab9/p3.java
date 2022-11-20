import java.util.Scanner;
import java.util.StringTokenizer;
class p3
 {
  public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     String str=new String();
     str=s.nextLine();
     String s2=args[0].concat(str);
     System.out.println("String 1 = "+args[0]);
     System.out.println("String 2 = "+str);
     System.out.println("Concinated String = "+s2);
     StringTokenizer st=new StringTokenizer(s2);
     String a[] = new String[5];
     while(st.hasMoreTokens())
      {
       System.out.println(st.nextToken());
      }
   }
}
