import java.io.*;

	public class apa {
		public static void main (String [] agrs) throws Exception {
			BufferedReader input = new BufferedReader ( new InputStreamReader (System.in));
			
			int N =0;
			String [][] jenisbarang  = new String [0][2];
			String [][] namamaster  = new String [0][4];
			int [][] angkamaster  = new int [0][3];
			double [][] diskon = new double[0][2];
			String [][] costumer  = new String [0][6];
			String [][] kodetujuan  = new String [0][3];
			String [][] transaksi  = new String [0][20];
			int [][] kirim = new int [0][1];
			
			do {
				System.out.println ("");
				System.out.println ("=======================================");
				System.out.println ("	    Selamat Datang");
				System.out.println ("        Di Toko Stikom Surabaya");
				System.out.println ("=======================================");
				System.out.println ("1. Data Jenis Barang");
				System.out.println ("2. Data Master");
				System.out.println ("3. Data Customer");
				System.out.println ("4. Data Kota Tujuan");
				System.out.println ("5. Transaksi Pengiriman");
				System.out.println ("6. Cetak Laporan");
				System.out.println ("7. Cetak Berdasarkan Tanggal");
				System.out.println ("8. Exit");
				System.out.print ("Masukkan Pilihan Menu Anda\t: ");
				int pilih = Integer.parseInt(input.readLine ());
				System.out.println ("");
				switch (pilih) {
					case 1:
						System.out.println ("========== Data Jenis Barang ==========");
						System.out.print ("Masukan Jumlah Barang\t\t: ");
						N = Integer.parseInt (input.readLine());
						
						jenisbarang = new String [N][2];
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Jenis Barang ke " +(i+1)+"\t: ");
							jenisbarang [i][0] = input.readLine ();
							System.out.print ("Masukkan Jenis Barang ke " +(i+1)+"\t: ");
							jenisbarang [i][1] = input.readLine ();			
						}
					break;
					case 2:
						System.out.println ("========== Data Master Barang ==========");
						System.out.print ("Masukan Jumlah Data Barang \t: ");
						N = Integer.parseInt (input.readLine());
						
						namamaster  = new String [N][4];
						angkamaster  = new int [N][3];
						diskon = new double [N][2];
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Barang ke " +(i+1)+"\t: ");
							namamaster [i][0] = input.readLine ();
							
								System.out.print ("Masukkan Kode Jenis Barang ke " +(i+1)+"\t: ");
								namamaster [i][1] = input.readLine ();
								
								//iki panggilan
								for(int j = 0; j<jenisbarang.length; j++){
									if (jenisbarang[j][0].equalsIgnoreCase (namamaster[i][1])){
										namamaster[i][2] = jenisbarang[j][1];
										System.out.println ("Nama Jenis Barang\t\t: "+namamaster[i][2] );
									}
									else {
										System.out.println ("Nama Jenis Barang\t\t: Tidak Ada" );
									}
								}
							System.out.print ("Masukkan Nama Barang ke " +(i+1)+"\t: ");
							namamaster [i][3] = input.readLine ();
							System.out.print ("Masukkan Berat Barang (gr) ke " +(i+1)+"\t: ");
							angkamaster [i][0] = Integer.parseInt(input.readLine ());
							System.out.print ("Masukkan Harga per Barang ke " +(i+1)+"\t: Rp." );
							angkamaster [i][1] = Integer.parseInt(input.readLine ()); 
								if (jenisbarang [i][0].equalsIgnoreCase ("wn")){
									angkamaster [i][2] = 40;
									diskon[i][0] = angkamaster[i][1]-(angkamaster[i][1]*0.4);
									System.out.println ("Anda Mendapat Diskon Sebesar\t: " +angkamaster [i][2] +" %");
								} 
								else if (jenisbarang [i][0].equalsIgnoreCase ("mo")){
									angkamaster [i][2] = 30;
									diskon[i][0] = angkamaster[i][1]-(angkamaster[i][1]*0.3);
									System.out.println ("Anda Mendapat Diskon Sebesar\t: " +angkamaster [i][2] +" %");
								}
								else {
									angkamaster[i][2] = 0;
									System.out.println ("Anda Mendapat Diskon Sebesar\t: " +angkamaster[i][2] +" %");
								}
								System.out.println ("");
						}
					break;
					case 3:
						System.out.println ("========== Data Costumer  ==========");
						System.out.print ("Masukan Jumlah Costumer \t: ");
						N = Integer.parseInt (input.readLine());
						
						costumer  = new String [N][6];
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Costumer ke " +(i+1)+"\t: ");
							costumer [i][0] = input.readLine ();
							System.out.print ("Masukkan Nama Costumer ke " +(i+1)+"\t: ");
							costumer [i][1] = input.readLine ();
							System.out.print ("Masukkan Alamat Costumer ke " +(i+1)+"\t: ");
							costumer [i][2] = input.readLine ();
							System.out.print ("Masukkan Telp/HP Costumer ke " +(i+1)+"\t: ");
							costumer [i][3] = input.readLine ();
							System.out.print ("Masukkan Email Costumer ke " +(i+1)+"\t: ");
							costumer [i][4] = input.readLine ();
							System.out.print ("Masukkan Kota Costumer ke " +(i+1)+"\t: ");
							costumer [i][5] = input.readLine ();
						}
					break;
					case 4:
						System.out.println ("========== Data Kota Tujuan  ==========");
						System.out.print ("Masukan Jumlah Kota Tujuan \t: ");
						N = Integer.parseInt (input.readLine());
						
						kodetujuan  = new String [N][3];
						for (int i=0; i<N;i++){	
							System.out.print ("Masukkan Kode Kota ke " +(i+1)+"\t\t: ");
							kodetujuan [i][0] = input.readLine ();
							System.out.print ("Masukkan Kota Tujan ke " +(i+1)+"\t: ");
							kodetujuan [i][1] = input.readLine ();
							System.out.print ("Masukkan Ongkos Kirim ke " +(i+1)+"\t: Rp. ");
							kodetujuan [i][2] = input.readLine ();
						}
					break;
					case 5:
					
						System.out.println ("========== Data Transaksi ==========");
						System.out.print ("Masukan Jumlah Barang \t\t: ");
						N = Integer.parseInt (input.readLine());
						
						transaksi = new String [N][20];
						kirim = new int [N][1];
						
						for (int i=0; i<N;i++){	
							System.out.print ("Masukkan Kode Transaksi ke " +(i+1)+"\t: ");
							transaksi [i][0] = input.readLine ();
							System.out.print ("Masukkan Tanggal Transaksi ke " +(i+1)+"\t: ");
							transaksi [i][1] = input.readLine ();
							System.out.print ("Masukkan Kode Costumer ke " +(i+1)+"\t: ");
							transaksi [i][2] = input.readLine ();
							
							//panggilkodecustomer
							if (costumer[i][0].equalsIgnoreCase (transaksi[i][2])){
								transaksi[i][3]=costumer[i][1];
								System.out.println ("Nama Costumer\t\t\t: "+transaksi[i][3]);
								transaksi[i][4]=costumer[i][2];
								System.out.println ("Alamat Costumer\t\t\t: "+transaksi[i][4]);
								transaksi[i][5]=costumer[i][3];
								System.out.println ("Telp/HP Costumer\t\t: "+transaksi[i][5]);
								transaksi[i][6]=costumer[i][4];
								System.out.println ("Kota Costumer\t\t\t: "+transaksi[i][6]);
							}
							else {
								System.out.println ("Costumer\t\t : tidak ada" );
							}
							
							System.out.print ("Masukkan Kode Barang ke " +(i+1)+"\t: ");
							transaksi [i][7] = input.readLine ();
							
							//panggildatamasterbarang
							if (namamaster[i][0].equalsIgnoreCase (transaksi[i][3])){
								
								System.out.println ("Kode Jenis Barang\t\t: "+namamaster[i][1]);
								
								System.out.println ("Nama Jenis Barang\t\t: "+namamaster[i][2]);
								
								System.out.println ("Nama Barang\t\t\t: "+namamaster[i][3]);
								
								System.out.println ("Berat Barang\t\t\t: "+angkamaster[i][0]);
								
								System.out.println ("Harga Barang\t\t\t: Rp. "+angkamaster[i][1]);
							}
							else {
								System.out.println ("kode barang\t\t : tidak ada" );
							}
							System.out.println ("Total Harga Setelah Diskon\t: " +diskon[i][0]);
							System.out.println ("Ongkos Kirim \t\t\t: " +kodetujuan[i][2]);
							System.out.print ("Status Pengiriman ke " +(i+1)+"\t\t: ");
							transaksi [i][4] = input.readLine ();
							System.out.print ("Nama Penerima Barang ke " +(i+1)+"\t: ");
							transaksi [i][5] = input.readLine();
							System.out.print ("Jumlah Kirim Barang ke " +(i+1)+"\t: ");
							kirim [i][0] = Integer.parseInt (input.readLine()); // kirim
							diskon[i][1] = diskon[i][0]*kirim[i][0];
							System.out.print ("Jumlah Harus Dibayar ke " +(i+1)+"\t: Rp. " +diskon[i][1]);
						}
					break;
					case 6:
						System.out.println ("======= Cetak Data Jenis Barang =======");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Jenis Barang ke " +(i+1) +"\t:" +jenisbarang[i][0]);
							System.out.println ("Jenis Barang ke " +(i+1) +"\t:" +jenisbarang[i][1]);
							System.out.println ("");
						}
						System.out.println ("======= Cetak Data Master =======");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Barang ke " +(i+1) +"\t:" +namamaster[i][0]);
							System.out.println ("Kode Jenis Barang ke " +(i+1) +"\t:" +namamaster[i][1]);
							System.out.println ("Nama Jenis Barang ke " +(i+1) +"\t:" +namamaster[i][2]);
							System.out.println ("Nama Barang ke " +(i+1) +"\t:" +namamaster[i][3]);
							System.out.println ("Berat Barang (gr) ke " +(i+1) +"\t:" +angkamaster[i][0]);
							System.out.println ("Harga Barang ke " +(i+1) +"\t: Rp. " +angkamaster[i][1]);
							System.out.println ("Diskon Barang ke " +(i+1) +"\t:" +angkamaster[i][2] +"%");
							System.out.println ("");
						}
						System.out.println ("======= Cetak Costumer =======");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Customer ke " +(i+1) +"\t:" +costumer [i][0]);
							System.out.println ("Nama Customer ke " +(i+1) +"\t:" +costumer [i][1]);
							System.out.println ("Alamat Customer ke " +(i+1) +"\t:" +costumer [i][2]);
							System.out.println ("Telp/HP Customer ke " +(i+1) +"\t:" +costumer [i][3]);
							System.out.println ("Email Customer ke " +(i+1) +"\t:" +costumer [i][4]);
							System.out.println ("Kota Costumer ke " +(i+1) +"\t:" +costumer [i][5]);
							System.out.println ("");
						}
						System.out.println ("======= Cetak Kota Tujuan =======");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Kota ke " +(i+1) +"\t\t\t:" +kodetujuan [i][0]);
							System.out.println ("Kota Tujuan ke " +(i+1) +"\t:" +kodetujuan [i][1]);
							System.out.println ("Ongkos Kirim ke " +(i+1) +"\t: Rp. " +kodetujuan [i][2]);
							System.out.println ("");
						}
						System.out.println ("======= Cetak Transaksi Pengiriman =======");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Transaksi ke " +(i+1) +"\t:" +transaksi [i][0]);
							System.out.println ("Tanggal Transaksi ke " +(i+1) +"\t:" +transaksi [i][1]);
						}
						
					break;
					case 7:
					break;
					case 8:
						System.exit(0);
					break;
					default:
						System.out.println ("Pilihan Menu hanya ada 1 - 8");
				}
				
			} while(true);
		}
	}