import java.io.*;
public class tugas {
	
	private static double alas (int jari){
		return (Math.PI*(Math.pow(jari,2)));
	}
	
	private static double volume (double tinggi, int jari){
		double volume1 = (alas(jari)*tinggi)/3;
		return (volume1);
	}
	
	public static void main (String[] args)throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Masukkan angka jari\t: ");
		int jari1 = Integer.parseInt(br.readLine());
		
		System.out.print("Masukkan angka tinggi\t: ");
		int tinggi1 = Integer.parseInt(br.readLine());
		
		System.out.print ("Hasil Volume Kerucut : " +Math.round(volume(tinggi1,jari1)));
		// System.out.print ("Hasil alat Kerucut : " +alas(jari1));
		
	}
}