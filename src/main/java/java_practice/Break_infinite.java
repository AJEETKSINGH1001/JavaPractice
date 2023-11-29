package java_practice;

public class Break_infinite {

	   public static void main(String args[]) {
	      int x = 10;

	      while( true ) {
	         System.out.print("value of x : " + x );
	         x++; //given condition
	         if(x == 15) {
	            break;
	         }
	         System.out.print("\n");
	      }
	   }
	}