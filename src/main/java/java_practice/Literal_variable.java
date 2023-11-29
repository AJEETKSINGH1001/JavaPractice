package java_practice;

public class Literal_variable {
	   public static void main(String args[]) {

	      int decimal = 100;
	      int octal = 0144;
	      int hexa =  0x64;

	      System.out.println(decimal);
	      System.out.println(octal);
	      System.out.println(hexa);

	      String msg1 = "Hello World";
	      String msg2 = "two\nlines";
	      String msg3 = "\"This is in quotes\"";

	      System.out.println(msg1);
	      System.out.println(msg2);
	      System.out.println(msg3);

	      char a = '\u0064';
	      String msg4 = "\u0064";

	      System.out.println(a);
	      System.out.println(msg4);   
	   }
	}