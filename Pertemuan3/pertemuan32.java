import java.io.*;

	public class pertemuan32 {
		public static void main (String[]args) throws Exception{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.print ("Masukan Total Pembelian : ");
				int total = Integer.parseInt(input.readLine ());
				double diskon = 0;
				if (total>= 100000) {
					diskon = total * 0.1;
				}
				
				System.out.println ("Diskon Pembelian : Rp " +diskon);
		}
	}