
/*Visible to the package, the default. No modifiers are needed.
Visible to the class only (private).
Visible to the world (public).
Visible to the package and all subclasses (protected).*/

/*
class AudioPlayer {
   protected boolean openSpeaker(Speaker sp) {
      // implementation details
   }
}

class StreamingAudioPlayer extends AudioPlayer {
   boolean openSpeaker(Speaker sp) {
      // implementation details
   }
}
*/

/*
Methods declared public in a superclass also must be public in all subclasses.

Methods declared protected in a superclass must either be protected or public in subclasses; they cannot be private.

Methods declared private are not inherited at all, so there is no rule for them.*/
package java_practice;

public class AccessModifier {
	   private int age;
	   String name;

	   public AccessModifier() {      
	   }

	   public void setAge( int age ) {
	      this.age = age;
	   }

	   public int getAge( ) {
	      return age;
	   }

	   public static void main(String []args) {
	      AccessModifier myPuppy = new AccessModifier();

	      // update age variable using method call
	      myPuppy.setAge( 2 );

	      // update name directly
	      myPuppy.name = "Tommy";
	      System.out.println("Age: " + myPuppy.getAge() +", name: " + myPuppy.name );
	   }
	}
