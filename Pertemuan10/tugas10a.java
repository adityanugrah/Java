import java.io.*;

public class tugas10a {
	public static int dataTotal (int uts, int uas) {
		int total = uts + uas ;
		return (total);
	}
	
	public static int dataRata (int uts, int uas) {
		int rata = (uts + uas)/2 ;
		return (rata);
	}
	
	public static void dataMhs (String nama, String nim) {
		System.out.println ("======================");
		System.out.println ("      Rapot Anda");
		System.out.println ("======================");
		System.out.println ("Nama Anda      : " +nama);
		System.out.println ("NIM Anda       : " +nim);
	}
	
	public static void dataNilai (int uts, int uas) {
		dataTotal (uts,uas);
		dataRata (uts,uas);
		System.out.println ("Nilai UTS Anda : " +uts);
		System.out.println ("Nilai UAS Anda : " +uas);
		System.out.println ("Hasil Anda     : " +dataRata(uts,uas));
	}
	
	public static void dataHasil (int uts, int uas){
		if (dataRata (uts,uas) > 70 ) {
			System.out.println ("Selamat Anda Lulus");
		}
		else {
			System.out.println ("Maaf coba lagi ");
		}
	}
	
	public static void main (String [] args ) throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ("Masukkan Nama Anda : ");
		String nama = input.readLine();
		System.out.print ("Masukkan NIM Anda  : ");
		String nim = input.readLine();
		System.out.print ("Masukkan Nilai UTS : ");
		int uts    = Integer.parseInt (input.readLine());
		System.out.print ("Masukkan Nilai UAS : ");
		int uas    = Integer.parseInt (input.readLine());
		dataMhs (nama,nim);
		dataNilai (uts,uas);
		dataHasil (uts,uas);
	}
}