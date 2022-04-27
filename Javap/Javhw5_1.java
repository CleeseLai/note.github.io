// Javhw5_1
import java.util.Scanner;
public class Javhw5_1
{
	public static void main(String args[])
	{
	   Scanner scn=new Scanner(System.in);
		int num;
		
		System.out.print("Total hours: ");
         num=scn.nextInt();
         
		if (num<=60)
			{
				System.out.println(num*100);
		    }
		else if (num<76 && num>=61)
			{
				System.out.println(60*100+(num-60)*150);
		    }
		else if (num>=76)
			{
				System.out.println(((num-75)*250)+8250);
			}
			
					
	  }

}