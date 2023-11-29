package java_practice;

public class Break_array {

	   public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};

	      for(int index = 0; index < numbers.length; index++) {
	         if(numbers[index] == 40){
	            break;
	         }
	         System.out.print("value of item : " + numbers[index] );         
	         System.out.print("\n");
	      }
	   }
	}
