package java_practice;

public class Puppy {
	   public Puppy(String name) {
	      // This constructor has one parameter, <i>name</i>.
	      System.out.println("Passed Name is :" + name );
	   }

	   public static void main(String []args) {
	      // Following statement would create an object myPuppy
	     Puppy name = new Puppy( "tommy" );
	   }
	}
