class p2
 {
  public static void main(String args[])
   { 
     StringBuffer str = new StringBuffer("Hello World");
     System.out.println("-----------------------------ensureCapacity--------------------------------");
     System.out.println("String :  "+str);
     System.out.println("Before ensureCapicity string capacity = "+str.capacity());
     str.ensureCapacity(30);
     System.out.println("After ensureCapicity string capacity = "+str.capacity());     
     System.out.println("-----------------------------replace--------------------------------");
     System.out.println("String before replace :  "+str);
     str.replace(6,11,"How");
     System.out.println("String After replace :  "+str);
     System.out.println("-----------------------------delete--------------------------------");
     System.out.println("String before delete :  "+str);
     str.delete(6,9);
     System.out.println("String after delete :  "+str);
     System.out.println("-----------------------------insert--------------------------------");
     System.out.println("String before insert :  "+str);
     str.insert(6,"World");
     System.out.println("String after insert :  "+str);
   }
}
