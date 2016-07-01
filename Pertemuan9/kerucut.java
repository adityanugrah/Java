import java.io.*;
public class kerucut {
	public static double luasalas (double jari) {
		double hasil = 3.14*jari*jari;
		return (hasil);
	}
	
	private static double volume(double tinggi, double jari){
		return (0.33*tinggi*luasalas(jari));
	}
	public static void main (String[] args)throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	System.out.print("Masukkan jari-jari: ");
	int a = Integer.parseInt(br.readLine());
	
	System.out.print("Masukkan tinggi: ");
	int b = Integer.parseInt(br.readLine());
	
	System.out.println("==================================");
	System.out.println("Hasil Luasalas	: "+luasalas(a));
	System.out.println("Hasil Volume	: "+volume(a,b));
	}
}