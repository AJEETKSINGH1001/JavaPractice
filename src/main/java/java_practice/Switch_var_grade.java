package java_practice;

public class Switch_var_grade {

	   public static void main(String args[]) {
	      String grade = "C";

	      switch(grade) {
	         case "A" :
	            System.out.println("Excellent!"); 
	            break;
	         case "B" :
	         case "C" :
	            System.out.println("Well done");
	            break;
	         case "D" :
	            System.out.println("You passed");
	         case "F" :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	   }
	}