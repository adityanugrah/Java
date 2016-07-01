import java.util.LinkedList;
import java.io.*;

public class tugas3b {
	public static void main (String[]args) throws Exception {
		LinkedList <String> myQ = new LinkedList <String> ();
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ("Input Jumlah Queue : ");
		int N = Integer.parseInt (input.readLine());
		
		System.out.println ("===================================");
		System.out.println ("              INPUT");
		System.out.println ("===================================");
		
		for (int i=0; i<N; i++) {
			System.out.print ("Masukkan Nama ke " +(i+1) +" : ");
			myQ.add (input.readLine());
		}
		
		System.out.println ("===================================");
		System.out.println ("              OUTPUT");
		System.out.println ("===================================");
		
		for (int i=0; i<N; i++) {
			//while(!myQ.isEmpty()) {
				System.out.println("Hasil ke " +(i+1) +" : " +myQ.poll());
			//}
		}			
	}
}