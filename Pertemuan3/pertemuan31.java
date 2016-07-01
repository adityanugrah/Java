import java.io.*;

public class pertemuan31 {
	public static void main (String[]args){
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print ("Masukan Nama Anda : ");
			String nama = input.readLine();
			System.out.print ("Masukan Usia Anda : ");
			int usia = Integer.parseInt(input.readLine ());
			System.out.println ("Nama : " +nama);
			System.out.println ("Usia : " +usia + "Tahun");			
		}
		catch (Exception e) {
			System.out.println ("Masukan inputan berupa angka...");
		}
	}
}