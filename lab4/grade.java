import java.util.Scanner;
class grade
	{
	public static void main(String args[])
		{
			int m1,m2,m3,m4,m5;
			char grad;
		 	Scanner s=new Scanner(System.in);
		 	System.out.println("enter Subject 1 marks :");
		 	m1=s.nextInt();
		 	System.out.println("enter Subject 2 marks :");
		 	m2=s.nextInt();
		 	System.out.println("enter Subject 3 marks :");
		 	m3=s.nextInt();
		 	System.out.println("enter Subject 4 marks :");
		 	m4=s.nextInt();
		 	System.out.println("enter Subject 5 marks :");
		 	m5=s.nextInt();
		 	float per=(m1+m2+m3+m4+m5)/5;
		 	System.out.println("Percentage : "+ per);
		 	
		 	if(per>90 && per<=100 )
		 		grad='O';
		 	else if(90<=per && per>80)
		 		grad='E';
		 	else if(per>70 && per<=80)
		 		grad='A';
		 	else if(per>60 && per<=70)
		 		grad='B';
		 	else if(per>=50 && per<60)
		 		grad='C';
		 	else if(per>=40 && per<50)
		 		grad='D';
		 	else
		 		grad='F';
		 	System.out.println("Grade : "+ grad);		 		
		 
		 }
	}
