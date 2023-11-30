package java_practice;
public class ExampleOverloading {

   public static void main(String[] args) {
      int a = 11;
      int b = 6;
      double c = 7.3;
      double d = 9.4;
      double result1 = minFunction(a, b);
      
      // same function name with different parameters
      double result2 = minFunction(c, d);
      System.out.println("Minimum Value = " + result1);
      System.out.println("Minimum Value = " + result2);
   }

   // for integer
   public static double minFunction(double c, double d) {
      double min;
      if (c > d)
         min = d;
      else
         min = c;

      return min; 
   }
}
   
   // for double