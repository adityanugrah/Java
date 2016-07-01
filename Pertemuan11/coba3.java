import java.util.*;

public class coba3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter numbers: ");
    int number = sc.nextInt();

    Stack<Integer> stack = new Stack<Integer>();
    stack.push(number);

    while (!(stack.isEmpty())) {
        System.out.println(stack.pop());
    }
}
}