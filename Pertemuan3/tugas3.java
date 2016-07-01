import java.io.*;

	public class tugas3 {
		public static void main (String[]args) throws Exception{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println ("===================================");
				System.out.println ("Pilihan Menu Toko Bunga : ");
				System.out.println ("1. Bunga Mawar ");
				System.out.println ("2. Bunga Anggrek ");
				System.out.println ("3. Bunga Tulip ");
				System.out.println ("4. Keluar/Selesai ");
				System.out.println ("===================================");
				System.out.print ("Masukan Pilihan Menu Anda : ");
				int pilih = Integer.parseInt(input.readLine ());
				int harga,hargat = 0;
				switch (pilih){
					case 1:
						System.out.print ("Masukan Jumlah Beli(lusin): ");
						int beli = Integer.parseInt(input.readLine ());
						harga = 1000;
						hargat = beli * harga;
												
						System.out.println ("");
						System.out.println ("");
						System.out.println ("=========== BUNGA MAWAR ===========");
						System.out.println ("===================================");
						System.out.println ("Harga \t\t: " +harga +" /lusin");
						System.out.println ("Jumlah Beli \t: " +beli +" lusin");
						System.out.println ("Harga Total \t: " +hargat);
						System.out.println ("===================================");
					break;
					case 2:
						System.out.print ("Masukan Jumlah Beli(lusin): ");
						int beli1 = Integer.parseInt(input.readLine ());
						harga = 2000;
						hargat = beli1 * harga;
						
						System.out.println ("");
						System.out.println ("");
						System.out.println ("========== BUNGA ANGGREK ==========");
						System.out.println ("===================================");
						System.out.println ("Harga \t\t: " +harga +" /lusin");
						System.out.println ("Jumlah Beli \t: " +beli1 +" lusin");
						System.out.println ("Harga Total \t: " +hargat);
						System.out.println ("===================================");
					break;
					case 3:
						System.out.print ("Masukan Jumlah Beli(lusin): ");
						int beli2 = Integer.parseInt(input.readLine ());
						harga = 3000;
						hargat = beli2 * harga;
											
						System.out.println ("");
						System.out.println ("");
						System.out.println ("=========== BUNGA TULIP ===========");
						System.out.println ("===================================");
						System.out.println ("Harga \t\t: " +harga +" /lusin");
						System.out.println ("Jumlah Beli \t: " +beli2 +" lusin");
						System.out.println ("Harga Total \t: " +hargat);
						System.out.println ("===================================");
					break;
					case 4:
						System.exit(0);
					break;
					default:
						System.out.println ("Pilihan Menu hanya ada 1 - 4");
				}
			} while(true);
		}
	}