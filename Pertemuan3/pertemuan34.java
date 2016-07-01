import java.io.*;

	public class pertemuan34 {
		public static void main (String[]args) throws Exception{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.print ("Masukan Lama Parkir : ");
				int parkir = Integer.parseInt(input.readLine ());
				int harga = 0;
				if ((parkir>= 0) && (parkir<=2)) {
					harga = 10000;
				}
				else if((parkir>= 3) && (parkir<=5)) {
					harga = 50000;
				}
				else {
					harga = 100000;
				}
				System.out.println ("Total Bayar Parkir : Rp " +harga);
		}
	}