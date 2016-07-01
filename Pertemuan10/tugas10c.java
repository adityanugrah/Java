import java.io.*;
public class tugas10c{
	public static String nama, nim;
	public static int uts, uas, totalnilai, ratanilai;
	
	public static void mahasiswa() throws Exception{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Masukkan Nama Mahasiswa : ");
		nama = input.readLine();
		System.out.print("Masukkan NIM Mahasiswa  : ");
		nim = input.readLine();
	}
	public static void nilai() throws Exception{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Masukkan Nilai UTS : ");
		uts = Integer.parseInt(input.readLine());
		System.out.print("Masukkan Nilai UAS : ");
		uas = Integer.parseInt(input.readLine());
	}
	public static void hasil(){
		System.out.println("Nama Mahasiswa  : "+nama);
		System.out.println("NIM Mahasiswa   : "+nim);
		System.out.println("Nilai UTS       : "+uts);
		System.out.println("NIlai UAS       : "+uas);
		System.out.println("Nilai rata-rata : "+rata(uts,uas));
		if (rata(uts,uas) >= 70){
			System.out.println("Yeah Anda Lulus");
		}
		else {
			System.out.println("Maaf Belom Beruntung");
		}
	}
	public static int total(int uts1,int uas1){
		totalnilai = uts1+uas1;
		return(totalnilai);
	}
	public static int rata(int uts1, int uas1){
		ratanilai = (total(uts1, uas1))/ 2 ;
		return(ratanilai);
	}
	
	public static void penting(){
		System.out.println("===========================");
	}
	
	public static void main(String[]args)throws Exception{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		do {
			penting();
			System.out.println("Tugas Minggu ke 10 ");
			System.out.println("1. Masukkan Data Mahasiswa ");
			System.out.println("2. Masukkan Nilai Mahasiswa ");
			System.out.println("3. Hasil Kuliah Mahasiswa ");
			System.out.println("4. Keluar ");
			System.out.print("Masukkan Pilihan Anda : ");
			int pilih = Integer.parseInt(input.readLine());
			penting();
			
			switch(pilih){
				case 1 :
					mahasiswa();
				break;
				case 2 :
					nilai();
				break;
				case 3 :
					hasil();
				break;
				case 4 :
					System.exit(0);
				break;
			}
		} while(true);
	}
}