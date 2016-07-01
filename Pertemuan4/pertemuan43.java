import java.io.*;

public class pertemuan43 {
	public static void main (String[]args) throws Exception{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.print ("Masukkan Batas Akhir Deret Angka = ");
		int batas = Integer.parseInt(input.readLine());
		
		for (int angka=1;angka<=batas;angka++) {
			System.out.println(angka*2); 
		}
		
		for (int angka=1;angka<=5;angka++) {
			System.out.println( angka + ". STIKOM Surabaya"); 
		}
	}
}	