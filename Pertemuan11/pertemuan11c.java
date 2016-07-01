import java.util.LinkedList;
//import java.util.Queue;

public class pertemuan11c {
	public static void main (String [] args) {
		LinkedList <Integer> myQ = new LinkedList <Integer> ();
		//Queue antrian = new LinkesList();
		
		myQ.add (1);
		myQ.add (6);
		myQ.add (3);
		System.out.println (myQ) ;
		
		int first = myQ.poll();
		
		System.out.println (first);
		System.out.println (myQ);
		
		myQ.add (2);
		
		System.out.println (myQ);
		myQ.poll();
		System.out.println (myQ);
	}
}

//add = masukkan
// element = melihat antrian yang pertama
// size = melihat jumlah yang ada