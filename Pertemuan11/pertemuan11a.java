import java.io.*;
public class pertemuan11a {
	
	public static int pangkat (int x, int y) {
		if (y==0) {
			return 1;
		}
		else {
			return x*pangkat (x, y-1);
		}
	}
	
	public static void main (String [] args ) {
			System.out.println ("Hasil 2 pangkat 3: " +pangkat(2,3));
	}	
}