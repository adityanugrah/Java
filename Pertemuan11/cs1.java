import java.util.*;
public class cs1 {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);


      System.out.print("Enter stack size: ");

      int number = sc.nextInt();
      int[] array = new int[number];

      Stack<Integer> stack = new Stack<Integer>();
      for(int i = 0; i < array.length; i++){
          System.out.println("Enter your number: ");
          String value = sc.nextInt();              
          stack.push(value);
      }

      while (!(stack.isEmpty())) {
          System.out.println(stack.pop());


      }    
    }
}