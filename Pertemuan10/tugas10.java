//switch class procedure
import java.io.*;

public class tugas10 {
	public static void dataMhs () throws Exception {
		String nama = "" ;
		String nim = "" ;
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ("Masukkan Nama Anda : ");
		nama = input.readLine();
		System.out.print ("Masukkan NIM Anda  : ");
		nim = input.readLine();
	}
	
	public static void dataNilai (int uts, int uas) throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ("Masukkan Nilai UTS : ");
		uts = Integer.parseInt (input.readLine());
		System.out.print ("Masukkan Nilai UAS : ");
		uas = Integer.parseInt (input.readLine());
		dataTotal (uts,uas);
		dataRata (uts,uas);
		dataHasil (uts,uas);
	}
	
	public static int dataTotal (int uts, int uas) {
		int total = uts + uas;;
		return (total);
	}
	
	public static int dataRata (int uts, int uas) {
		int rata = dataTotal(uts,uas)/2;
		return (rata);
	}
	
	public static void dataHasil (int uts, int uas) {
		if (dataRata(uts,uas) > 70){
			System.out.println ("Hasil : " +dataRata(uts,uas) +" Lulus");
		}
		else {
			System.out.println ("Hasil : " +dataRata(uts,uas) +" Tidak Lulus");
		}
	}
	
	public static void main (String [] args) throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		do {
			
			System.out.println ("====================================");
			System.out.println ("Pilihan Menu               :");
			System.out.println ("1. Input Data Mahasiswa");
			System.out.println ("2. Input Data Nilai Mahasiswa");
			System.out.println ("3. Hasil Nilai Akhir Mahasiswa");
			System.out.println ("4. Exit / Keluar");
			System.out.print ("Masukkan Menu Pilihan Anda : ");
			int pilih = Integer.parseInt (input.readLine ());
			System.out.println ("====================================");
			
			switch (pilih) {
				case 1 :
					dataMhs ();
				break;
				case 2 :
					int uts = 0;
					int uas = 0;
					dataNilai (uts,uas);
				break;
				case 3 :
					uts = 0;
					uas = 0;
					dataHasil (uts,uas);
				break;
				case 4 :
					System.exit(0);
				break;
			}
		} while (true);
	} 
}