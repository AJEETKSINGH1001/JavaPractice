package java_practice;

public class Do_while_array {

	   public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};
	      int index = 0;

	      do {
	         System.out.print("value of item : " + numbers[index] );
	         index++;  //condition given
	         System.out.print("\n");
	      } while( index < 2 );
	   }
	}
