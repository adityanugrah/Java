import java.util.Stack;

public class pertemuan11d {
	public static void main (String [] args) {
		Stack <String> mangkok = new Stack <String> ();
		mangkok.push ("Merah");
		mangkok.push ("Kuning");
		mangkok.push ("Hijau");
		
		mangkok.pop (); 
		mangkok.peek ();
		
		while (!mangkok.empty()) {
			System.out.print (mangkok.pop());
		}
	}
}

//pop  = mengeluarkan posisi atas
//peek = melihat posisi atas
//size = meilhat jumlah yang ada