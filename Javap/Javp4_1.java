public class Javp4_1 
{ public static void main(String args [ ]) 
   { 
      char grade='C';
 
       switch ( grade ) 
       	{
       		case'A':
             System.out.println("優秀"); 
             break;
          case'B':
          case'C':
             System.out.println("良好");
            break;
          case'D':
             System.out.println("及格");
             break;
          case'F':
             System.out.println("你需要再努力努力");
             break;
          default:
             System.out.println ("未知等級");
       } System.out.println("你的等級是"+ grade );
    } 
}