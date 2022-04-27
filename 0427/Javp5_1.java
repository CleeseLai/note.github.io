// Javp5_1
import java.util.Scanner;
public class Javp5_1
{
	public static void main(String args[])
	{
	   Scanner scn=new Scanner(System.in);
		int a;
		
		System.out.print("Age:");
         a=scn.nextInt();
         
		if (a<=17)
			System.out.println(a+"is not an adault");
		if (a>18)
			System.out.println(a+"is an adault");
	}

}