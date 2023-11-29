package java_practice;

public class Uninitial_var {
	   public void pupAge() {
	      int age;
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	   }

	   public static void main(String args[]) {
		   Uninitial_var test = new Uninitial_var();
	      test.pupAge();
	   }
	}

//Should show an error