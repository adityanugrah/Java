import java.util.LinkedList;
import java.io.*; 
 
public class tugas3 {
	public static void main (String [] args) throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		LinkedList <String> myQ = new LinkedList <String> ();
		
		System.out.print ("Masukkan Kata : ");
		String kata1 = input.readLine();
		System.out.print ("Masukkan Kata : ");
		String kata2 = input.readLine();
		System.out.print ("Masukkan Kata : ");
		String kata3 = input.readLine();
		System.out.print ("Masukkan Kata : ");
		String kata4 = input.readLine();
		
		
		myQ.add ("" +kata1);
		myQ.add ("" +kata2);
		myQ.add ("" +kata3);
		myQ.add ("" +kata4);
		
		System.out.println ("Hasil : " +myQ);
		
		String first = myQ.poll();
		
		System.out.print ("Masukkan Kata : ");
		String kata5 = input.readLine();
		
		myQ.add ("" +kata5);
		
		System.out.print ("Hasil : " +myQ);
		
	}
}