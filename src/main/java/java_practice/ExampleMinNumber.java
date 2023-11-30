package java_practice;
public class ExampleMinNumber {
   
   public static void main(String[] args) {
      int a = 11;
      int b = 6;
      int c = minFunction(a, b);
      System.out.println("Minimum Value = " + c);
   }

   /** returns the minimum of two numbers */
   public static int minFunction(int a, int b) {
      int min;
      if (a > b)
         min = b;
      else
         min = a;

      return min; 
   }
}