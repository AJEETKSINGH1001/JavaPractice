package java_practice;

public class Local_variable {
   public void pupAge() {
      int age = 0;
      age = age + 7;
      System.out.println("Puppy age is : " + age);
   }

   public static void main(String args[]) {
      Local_variable test = new Local_variable();
      test.pupAge();
   }
}