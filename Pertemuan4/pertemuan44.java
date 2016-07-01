import java.io.*;

public class pertemuan44 {
	public static void main (String[]args) throws Exception{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.print ("Masukan Batas Perulangan = ");
		int batas = Integer.parseInt(input.readLine());
		
		for (int baris=1;baris<=batas;baris++) {
			for (int kolom=1;kolom<=batas;kolom++) {
			System.out.print("*"); 
		}
			System.out.println();
		}
	}
}	