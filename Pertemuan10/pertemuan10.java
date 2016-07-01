//function didalam procedure, yang dipangggil pada program utama yang procedure
import java.io.*;

public class pertemuan10 {
	public static void garis () {
		System.out.println ("=========================");
	}
	
	public static void dataNama (String nama, String nim){
		System.out.println ("Nama Mahasiswa : " +nama);
		System.out.println ("NIM Mahasiswa : " +nim);
	}
	
	public static void dataNilai (double nilai1, double nilai2, double nilai3){
		System.out.println ("Nilai Tugas Pertama :" +nilai1);
		System.out.println ("Nilai Tugas Kedua   :" +nilai2);
		System.out.println ("Nilai Tugas ketiga  :" +nilai3);
		System.out.println ("Nilai rata -rata    :" +Math.round (rata(nilai1,nilai2,nilai3)));
	}
	
	public static double rata (double nilai1R, double nilai2R, double nilai3R){
		double ratanilai = (nilai1R + nilai2R + nilai3R)/3;
		return (ratanilai);
	}
	
	public static void main (String [] args) throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		garis ();
		System.out.println ("Data Nilai Mahasiswa");
		garis ();
		
		System.out.print ("Masukkan Nama Mahasiswa : ");
		String namaMhs = input.readLine();
		System.out.print ("Masukkan NIM Mahasiswa  : ");
		String nimMhs = input.readLine();
		System.out.print ("Masukkan Nilai Tugas-1  : ");
		double nilaiMhs1 = Double.parseDouble(input.readLine());
		System.out.print ("Masukkan Nilai Tugas-2  : ");
		double nilaiMhs2 = Double.parseDouble(input.readLine());
		System.out.print ("Masukkan Nilai Tugas-3  : ");
		double nilaiMhs3 = Double.parseDouble(input.readLine());
		
		garis();
		dataNama (namaMhs, nimMhs);
		dataNilai (nilaiMhs1, nilaiMhs2, nilaiMhs3);
		garis();
		
	}
}