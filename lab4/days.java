import java.util.Scanner;
class days
	{
	public static void main(String args[])
		{
		 	int ch;
		 	Scanner s=new Scanner(System.in);
		 	System.out.println("Enter a no :");
		 	ch=s.nextInt();
		 	switch (ch)
		 	{
		 		case 0:
		 		System.out.println("Sunday");
		 		break;
		 		case 1:
		 		System.out.println("Monday");
		 		break;
		 		case 2:
		 		System.out.println("Tuesday");
		 		break;
		 		case 3:
		 		System.out.println("Wednesday");
		 		break;
		 		case 4:
		 		System.out.println("Thrusday");
		 		break;
		 		case 5:
		 		System.out.println("Friday");
		 		break;
		 		case 6:
		 		System.out.println("Saturday");
		 		break;
		 		default:
		 		System.out.println("Invalid input");
		 		break;
		 	}
		 }
	}
