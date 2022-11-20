import java.util.Scanner;
class p1
 {
  public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
    String str;
    int ch;
    System.out.print("Enter the String : ");
    str=s.next();
    do
    {
     System.out.println("Menu ");
     System.out.println("1-Change Case of String ");
     System.out.println("2-Reverse String ");
     System.out.println("3-Compare two String ");
     System.out.println("4-Insert one String to another String ");
     System.out.println("5-End");
     System.out.println();
     System.out.print("Enter Choice : ");
     ch=s.nextInt();
     if(ch==1)
      {
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
      }
     if(ch==2)
      {
       StringBuffer sb=new StringBuffer(str);
       System.out.println(sb.reverse());
      }
     if(ch==3)
      {
       String str1;
       System.out.print("Enter the 2nd String to compare : ");
       str1=s.next();
       System.out.println("== "+(str==str1));
       System.out.println("equals() "+(str.equals(str1)));
       System.out.println("compareTo() "+(str.compareTo(str1)));
      }
     if(ch==4)
      {
       String str1;
       System.out.print("Enter the 2nd String to add : ");
       str1=s.next();
       System.out.println(str.concat(str1));
      }
    }while(ch<5);
  }
}
    
    

