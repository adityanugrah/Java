//switch class procedure
import java.io.*;

public class pertemuan10_1 {
	public static void kerajinanPP () throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ("Masukkan Nama Jenis Kerajinan     : ");
		String jenis = input.readLine();
		System.out.print ("Masukkan Ukuran Panjang Kerajinan : ");
		int panjang = Integer.parseInt (input.readLine());
		System.out.print ("Masukkan Ukuran Lebar Kerajinan   : ");
		int lebar = Integer.parseInt (input.readLine());
		System.out.print ("Luas Kerajinan : " +luasPP (panjang,lebar));
	}
	
	public static int luasPP (int pj, int lb ) {
		int luas = pj*lb;
		return (luas);
	}
	
	public static void kerajinanLL () throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ("Masukkan Nama Jenis Kerajinan     : ");
		String jenis = input.readLine();
		System.out.print ("Masukkan Jari Lingkaran Kerajinan : ");
		int jari = Integer.parseInt (input.readLine());
		System.out.print ("Luas Kerajinan : " +luasLL (jari));
	}
	
	public static double luasLL (int jr ) {
		double luasl = Math.PI*jr*jr;
		return (luasl);
	}
	
	public static void main (String [] args) throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println ("");
		System.out.println ("Pilihan Menu               :");
		System.out.println ("1. Kerajinan Bidang Persegi Panjang");
		System.out.println ("2. Kerajinan Bidang Lingkaran");
		System.out.println ("3. Exit / Keluar");
		System.out.print ("Masukkan Menu Pilihan Anda : ");
		int pilih = Integer.parseInt (input.readLine ());
		
		switch (pilih) {
			case 1 :
				kerajinanPP ();
			break;
			case 2 :
				kerajinanLL ();
			break;
			case 3 :
				System.exit(0);
			break;
		}
		
	}
}