// Javp4_5
import java.util.Scanner;
public class Javp4_5
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int a;
		
		System.out.print("���W���Z:");
         a=scn.nextInt();
         
         if ((a<0) || (a>100))		
			System.out.println("���Z��J���~��!");
		
		 if ((a<60) && (a>49))		
			System.out.println("�A�n�ɦҤF�հګ�������!");
		 
		 if ((a>=60) && (a<=100))		
			System.out.println("�A�L�F�@!�A�W�ΡI");	
	}
}