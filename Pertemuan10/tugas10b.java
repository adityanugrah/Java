//switch class procedure
import java.io.*;

public class tugas10b {
	public static void dataMhs () throws Exception {
		String nama = "" ;
		String nim = "" ;
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ("Masukkan Nama Anda : ");
		nama = input.readLine();
		System.out.print ("Masukkan NIM Anda  : ");
		nim = input.readLine();
	}
	
	public static int dataNilai () throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int uts = 0;
		int uas = 0;
		int nilai = 0;
		System.out.print ("Masukkan Nilai UTS : ");
		uts = Integer.parseInt (input.readLine());
		System.out.print ("Masukkan Nilai UAS : ");
		uas = Integer.parseInt (input.readLine());
		nilai = uts + uas;
		return nilai;
	}
	
	public static int dataTotal ()throws Exception {
		int total = dataNilai();
		return (total);
	}
	
	public static int dataRata ()throws Exception {
		int rata = dataTotal ()/2;
		return (rata);
	}
	
	public static void dataHasil ()throws Exception {
		if (dataRata() > 70){
			System.out.println ("Hasil : " +dataRata() +" Lulus");
		}
		else {
			System.out.println ("Hasil : " +dataRata() +" Tidak Lulus");
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
					dataNilai ();
				break;
				case 3 :				
					dataHasil ();
				break;
				case 4 :
					System.exit(0);
				break;
			}
		} while (true);
	} 
}