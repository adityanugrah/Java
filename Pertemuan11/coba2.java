import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class coba2 {
	
	Scanner scan;
	Queue<String> queue;
	
	int n;
	
	void insert() {
		
		scan = new Scanner(System.in);
		queue = new LinkedList<String>();
		
		System.out.println("String Queue - Insert & Delete");
		
		System.out.println("\nEnter 'n' value :");
		n = scan.nextInt();
		
		System.out.println("Enter the elements");
		
		for(int i=0; i<n; i++) {
			
			queue.add(scan.next());
		}		
	}
	
	void delete() {
		
		System.out.println("\nThe Queue");
 
		while(!queue.isEmpty()) {
			
			System.out.println(queue.poll());
		}
	}

	public static void main(String args[]) {
		
		coba2 obj = new coba2();
		
		obj.insert();
		obj.delete();;
	}
}