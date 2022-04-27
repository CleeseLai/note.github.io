// Javp4_5
import java.util.Scanner;
public class Javp4_5
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int a;
		
		System.out.print("報上成績:");
         a=scn.nextInt();
         
         if ((a<0) || (a>100))		
			System.out.println("成績輸入錯誤啦!");
		
		 if ((a<60) && (a>49))		
			System.out.println("你要補考了啦啊哈哈哈哈!");
		 
		 if ((a>=60) && (a<=100))		
			System.out.println("你過了哦!你超棒！");	
	}
}