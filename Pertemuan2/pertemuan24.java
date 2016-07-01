import java.util.*;
	
	public class pertemuan24 {
		public static void main (String[]arg){
			Scanner inputan = new Scanner(System.in); //harus hafal
			System.out.print ("Masukan Nama Anda = ");
			String nama = inputan.nextLine();
			System.out.print ("Masukan NIM Anda = ");
			String nim = inputan.nextLine();
			System.out.print ("Masukan Usia Anda = ");
			int usia = Integer.parseInt(inputan.nextLine());
			System.out.println("=====================");
			System.out.println ("Nama\t:"+nama);
			System.out.println ("NIM\t:"+nim);
			System.out.println ("Usia\t:"+usia + " Tahun");
		
		}
	}