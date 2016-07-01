import java.io.*;

	public class pertemuan35 {
		public static void main (String[]args) throws Exception{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.print ("Masukan Jenis Mobil : ");
				String mobil = input.readLine ();
				System.out.print ("Masukan Lama Parkir : ");
				int parkir = Integer.parseInt(input.readLine ());
				int harga = 0;
				if (mobil.equals("Jazz")){
					if ((parkir>= 0) && (parkir<=2)) {
						harga = 10000;
					}
					else if((parkir>= 3) && (parkir<=5)) {
						harga = 50000;
					}
					else {
						harga = 100000;
					}
				}	
				else if (mobil.equals("Alphard")){
					if ((parkir>= 0) && (parkir<=2)) {
					harga = 50000;
				}
				else if((parkir>= 3) && (parkir<=5)) {
					harga = 100000;
				}
				else {
					harga = 200000;
				}
			}
				else {
					if ((parkir>= 0) && (parkir<=2)) {
					harga = 80000;
				}
				else if((parkir>= 3) && (parkir<=5)) {
					harga = 800000;
				}
				else {
					harga = 8000000;
				}
			}
				System.out.println ("Total Bayar Parkir  : Rp " +harga);
		}
				
	}