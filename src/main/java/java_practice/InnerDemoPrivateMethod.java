package java_practice;

import java_practice.Outer_Demo11.Inner_Demo;

class Outer_Demo11 {
	   // private variable of the outer class
	   private int num = 175;  
	   
	   // inner class
	   public class Inner_Demo {
	      public int getNum() {
	         System.out.println("This is the getnum method of the inner class");
	         return num;
	      }
	   }
	}

	public class InnerDemoPrivateMethod {

	   public static void main(String args[]) {
	      // Instantiating the outer class
	      Outer_Demo outer = new Outer_Demo();
	      
	      // Instantiating the inner class
	      Inner_Demo inner = outer.new Inner_Demo();
	      System.out.println(inner.getNum());
	   }
	}
