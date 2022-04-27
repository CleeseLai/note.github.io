// Javp4
import java.util.Scanner;
public class Javp4
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		 float a=29.5f;
		 float b;
		 
		System.out.print("請輸入想兌換多少美元:");
         b=scn.nextFloat();
 		System.out.println("可兌換"+(a*b)+"元臺幣");
		
	}
}