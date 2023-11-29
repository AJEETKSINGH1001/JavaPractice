package java_practice;

public class Continue_do_while {

	   public static void main(String args[]) {
	      int x = 10;

	      do {
	         x++;
	         if(x == 15){
	            continue;		 
	         }   
	         System.out.print("value of x : " + x );
	         System.out.print("\n");
	      } while( x < 20 );
	   }
	}
