import java.io.*;

	public class baru {
		public static void main (String [] agrs) throws Exception {
			BufferedReader input = new BufferedReader ( new InputStreamReader (System.in));
			
			int N =0;
			String [][] jenisbarang  = new String [0][2];
			String [][] namamaster  = new String [0][4];
			int [][] angkamaster  = new int [0][3];
			double [][] diskon = new double[0][4];
			double [][] kirim = new double[0][10];
			String [][] costumer  = new String [0][6];
			String [][] kodetujuan  = new String [0][2];
			String [][] transaksi  = new String [0][13];
			int [][] kirimo = new int [0][1];
			
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
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Barang ke " +(i+1)+"\t: ");
							namamaster [i][0] = input.readLine ();
						
							System.out.print ("Masukkan Kode Jenis Barang ke " +(i+1)+"\t: ");
							namamaster [i][1] = input.readLine ();
							
								for(int j = 0; j<jenisbarang.length; j++){
										if (jenisbarang[j][0].equalsIgnoreCase (namamaster[i][1])){
											namamaster[i][2] = jenisbarang[j][1];
											System.out.println ("Nama Jenis Barang\t\t: "+namamaster[i][2] );
										}
										else {
											namamaster[i][2]= "Tidak Ada";
											System.out.println ("Nama Jenis Barang\t\t: " +namamaster[i][2] );
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
									System.out.println ("Anda Mendapat Diskon Sebesar\t: " +angkamaster [i][2] +" %");
								} 
								else if (jenisbarang [i][0].equalsIgnoreCase ("mo")){
									angkamaster [i][2] = 30;
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
						
						kodetujuan  = new String [N][2];
						kirimo = new int [N][10];
						
						for (int i=0; i<N;i++){	
							System.out.print ("Masukkan Kode Kota ke " +(i+1)+"\t\t: ");
							kodetujuan [i][0] = input.readLine ();
							System.out.print ("Masukkan Kota Tujuan ke " +(i+1)+"\t: ");
							kodetujuan [i][1] = input.readLine ();
							System.out.print ("Masukkan Ongkos Kirim ke " +(i+1)+"\t: Rp. ");
							kirimo [i][0] = Integer.parseInt (input.readLine ());
						}
					break;
					case 5:
					
						System.out.println ("========== Data Transaksi ==========");
						System.out.print ("Masukan Jumlah Barang \t\t: ");
						N = Integer.parseInt (input.readLine());
						
						transaksi = new String [N][20];
						kirim = new double [N][10];
						diskon = new double [N][4];
						
						
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
								System.out.println ("Alamat Costumer\t\t\t: "+transaksi[i][5]);
								transaksi[i][6]=costumer[i][4];
								System.out.println ("Telp/HP Costumer\t\t: "+transaksi[i][6]);
								transaksi[i][7]=costumer[i][5];
								System.out.println ("Kota Costumer\t\t\t: "+transaksi[i][7]);
							}
							else {
								System.out.println ("Costumer\t\t : tidak ada" );
							}
							
							System.out.print ("Masukkan Kode Barang ke " +(i+1)+"\t: ");
							transaksi [i][8] = input.readLine ();
							//datamasterbarang
							if (namamaster[i][0].equalsIgnoreCase (transaksi[i][8])){
								transaksi [i][9]=namamaster[i][1];
								System.out.println ("Kode Jenis Barang\t\t: " +transaksi [i][9]);
								transaksi [i][10]=namamaster[i][2];
								System.out.println ("Nama Jenis Barang\t\t: "+transaksi [i][10]);
								transaksi [i][11]=namamaster[i][3];
								System.out.println ("Nama Barang\t\t\t: "+transaksi [i][11]);
								
								kirim [i][0]=angkamaster[i][0];
								System.out.println ("Berat Barang (gr)\t\t: "+kirim [i][0]);
								kirim [i][1]=angkamaster[i][1];
								System.out.println ("Total Harga Barang\t\t: Rp. "+kirim [i][1]);
								diskon [i][2]=angkamaster[i][2];
								System.out.println ("Diskon Barang\t\t\t: Rp. "+diskon [i][2] +"%");
			
								if (jenisbarang [i][0].equalsIgnoreCase ("wn")){
									diskon[i][0] = (angkamaster[i][1]-(angkamaster[i][1]*0.4));
								} 
								else if (jenisbarang [i][0].equalsIgnoreCase ("mo")){
									diskon[i][0] = (angkamaster[i][1]-(angkamaster[i][1]*0.3));
								}
								else {
									diskon [i][0] = angkamaster[i][1];
								}
			
								kirim [i][2] = diskon[i][0];
								System.out.println ("Total Harga Setelah Diskon\t: Rp. " +kirim[i][2]);
								kirim [i][3] = kirimo [i][0];
								System.out.println ("Ongkos Kirim \t\t\t: Rp. " +kirimo [i][0]);
							}
							else {
								System.out.println ("Kode Barang\t\t\t: tidak ada" );
							}
							
							System.out.print ("Status Pengiriman ke " +(i+1)+"\t\t: ");
							transaksi [i][12] = input.readLine ();
							System.out.print ("Nama Penerima Barang ke " +(i+1)+"\t: ");
							transaksi [i][13] = input.readLine();
							System.out.print ("Jumlah Kirim Barang ke " +(i+1)+"\t: ");
							kirim [i][4] = Double.parseDouble (input.readLine());
							diskon[i][2] = (kirim[i][3]+kirim[i][2])*kirim [i][4];
							System.out.print ("Jumlah Harus Dibayar ke " +(i+1)+"\t: Rp. " +diskon[i][2]);
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
							System.out.println ("Kode Customer ke " +(i+1) +"\t:" +transaksi [i][2]);
							System.out.println ("Nama Transaksi ke " +(i+1) +"\t:" +transaksi [i][3]);
							System.out.println ("ALamat Transaksi ke " +(i+1) +"\t:" +transaksi [i][4]);
							System.out.println ("Telp/HP Transaksi ke " +(i+1) +"\t:" +transaksi [i][5]);
							System.out.println ("Email Transaksi ke " +(i+1) +"\t:" +transaksi [i][6]);
							System.out.println ("Kota Transaksi ke " +(i+1) +"\t:" +transaksi [i][7]);
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