import java.io.*;

	public class pertemuan25{
		public static void main (String[]arg) throws Exception{
			BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in)); //harus hafal
			System.out.print ("Masukan Nama Anda = ");
			String nama = inputan.readLine();
			System.out.print ("Masukan NIM Anda = ");
			String nim = inputan.readLine();
			System.out.print ("Masukan Usia Anda = ");
			int usia = Integer.parseInt(inputan.readLine());
			System.out.println("=====================");
			System.out.println ("Nama\t:"+nama);
			System.out.println ("NIM\t:"+nim);
			System.out.println ("Usia\t:"+usia + " Tahun");
			
		}
	}