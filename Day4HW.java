import java.util.Scanner;
public class Day4HW {
  public static void main(String[] args) {

      int a;
      int b;
      int sum;

      Scanner sc=new Scanner(System.in);

      System.out.println("Enter first number");
      a=sc.nextInt();
      
      System.out.println("Enter second number");
      b=sc.nextInt();

      sum = a + b;

      sc.close();  // close Scanner object

      System.out.println("The sum of a and b is " + sum);
  }
}

/* Output:

PS C:\Users\diane\OneDrive\Desktop\DianeGrangerWork\Java Zero to Hero> javac Day4HW.java
PS C:\Users\diane\OneDrive\Desktop\DianeGrangerWork\Java Zero to Hero> java Day4HW
Enter first number
10
Enter second number
5
The sum of a and b is 15
PS C:\Users\diane\OneDrive\Desktop\DianeGrangerWork\Java Zero to Hero>

*/
