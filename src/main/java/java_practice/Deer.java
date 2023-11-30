/*Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java, all Java objects are polymorphic since any object will pass the IS-A 
test for their own type and for the class Object.*/


package java_practice;

interface Vegetarian{}
class Animal{}
public class Deer extends Animal implements Vegetarian{
	public static void main(String[] args) {
		Deer d = new Deer();
		Animal a = d;
		Vegetarian v = d;
		Object o = d;
		
		System.out.println(d instanceof Deer);
		System.out.println(a instanceof Deer);
		System.out.println(v instanceof Deer);
		System.out.println(o instanceof Deer);
	}	
}
