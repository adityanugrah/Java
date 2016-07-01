import java.io.*;

	public class pertemuan26 {
		public static void main (String[]args) throws Exception {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.print ("Masukan Nama Anda :");
			String nama = input.readLine();
			System.out.print ("Masukan Usia Anda :");
			int usia = Integer.parseInt(input.readLine ());
			System.out.println ("Nama : " +nama);
			System.out.println ("Usia : " +usia);			
		
		}
	}