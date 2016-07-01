import java.io.*;
public class pertemuan11 {
	
	public static int faktorial (int x) {
		if (x==0) {
			return 1;
		}
		else {
			return x*faktorial (x-1);
		}
	}
	
	public static void main (String [] args ) throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			int x = 3;
			System.out.println ("Faktorial : " +x);
			System.out.println ("Hasil     : " +faktorial(x));
	}	
}

//memanggil dirinya sendiri (rekursive)