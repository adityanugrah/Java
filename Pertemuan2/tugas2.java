import java.io.*;

	public class tugas2 {
		public static void main (String[]args) throws Exception {
			BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in)); //harus hafal
			
			System.out.println("==============================================");
			System.out.print ("Masukan Nama Toko 	= "); 
			String nama = inputan.readLine();
			System.out.print ("Masukan Alamat Toko 	= ");
			String alamat = inputan.readLine();
			System.out.print ("Masukan Telepon		= ");
			String telepon = inputan.readLine();
			System.out.print ("Jenis Bunga Yang dijual = ");
			String jenis = inputan.readLine();
			System.out.print ("Harga Per Batang Bunga 	= ");
			int harga = Integer.parseInt(inputan.readLine());
			System.out.print ("Jumlah Beli 		= ");
			int jumlah = Integer.parseInt(inputan.readLine());
			int jumlah1 = jumlah * 12;
			int total = harga * jumlah1;
			
			System.out.println ();
			System.out.println("==============================================");
			System.out.println("            DATA PENJUALAN BUNGA");
			System.out.println("==============================================");
			System.out.println ("Nama Toko\t\t: "+nama);
			System.out.println ("Alamat Toko\t\t: "+alamat);
			System.out.println ("Telepon\t\t\t: "+telepon );
			System.out.println ("Jenis Bunga yg dipilih\t: "+jenis);
			System.out.println ("Harga Perbatang Bunga\t: "+harga);
			System.out.println ("Jumlah Pembelian\t: "+jumlah + " lusin");
			System.out.println ("Total Harga\t\t: "+total );
			System.out.println("=================TERIMA KASIH=================");
						
		}
	}