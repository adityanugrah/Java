import java.util.*;
public class CS {
    public static void main(String []args) {

        Scanner keys = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = keys.nextInt();

        while(true)
        {
            if(n>0)
            {
                System.out.println("Enter again: ");
                n = keys.nextInt();
            }
            else
            {
                System.out.println("Number is negative! System Shutdown!");
                System.exit(1);
            }

        }
    }
}