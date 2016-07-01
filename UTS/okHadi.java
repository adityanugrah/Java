import java.io.*;
	public class okHadi {
		public static void main (String [] agrs) throws Exception {
			BufferedReader input = new BufferedReader ( new InputStreamReader (System.in));
			//deklarasi
			int N =0;
			String tanggal;
			String [][] jenisbarang	= new String [0][2];
			String [][] namamaster	= new String [0][4];
			double [][] angkamaster	= new double [0][4];
			String [][]	costumer	= new String [0][7];
			double [][]	ongkos		= new double [0][1];
			String [][] tujuan		= new String [0][2];
			String [][] transaksi	= new String [0][14];
			double [][] biaya		= new double [0][7];
				
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
						
						namamaster	= new String [N][4];
						angkamaster	= new double [N][4];
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Barang ke " +(i+1)+"\t: ");
							namamaster	[i][0] = input.readLine ();
							System.out.print ("Masukkan Kode Jenis Barang ke " +(i+1)+"\t: ");
							namamaster	[i][1] = input.readLine ();
								for(int j = 0; j<jenisbarang.length; j++){	
									if (jenisbarang[j][0].equalsIgnoreCase (namamaster[i][1])){
										namamaster	[i][2] = jenisbarang [j][1];
										System.out.println ("Nama Jenis Barang\t\t: "+namamaster[i][2]);
									}
								}		
							System.out.print ("Masukkan Nama Barang ke " +(i+1)+"\t: ");
							namamaster	[i][3] = input.readLine ();
							System.out.print ("Masukkan Berat Barang (gr) ke " +(i+1)+"\t: ");
							angkamaster	[i][0] = Integer.parseInt(input.readLine ());
							System.out.print ("Masukkan Harga per Barang ke " +(i+1)+"\t: Rp." );
							angkamaster	[i][1] = Integer.parseInt(input.readLine ()); 
								
									if (namamaster [i][1].equalsIgnoreCase ("wn")){
										angkamaster	[i][2]	= 40;
										System.out.println ("Anda Mendapat Diskon Sebesar\t: " +angkamaster [i][2] +" %");
										angkamaster	[i][3]	= angkamaster [i][1] - (angkamaster [i][1]*0.4);
									} 
									else if (namamaster [i][1].equalsIgnoreCase ("mo")){
										angkamaster [i][2]	= 30;
										System.out.println ("Anda Mendapat Diskon Sebesar\t: " +angkamaster [i][2] +" %");
										angkamaster	[i][3]	= angkamaster [i][1] - (angkamaster [i][1]*0.3);
									}
									else {
										angkamaster[i][2]	= 0;
										System.out.println ("Anda Mendapat Diskon Sebesar\t: " +angkamaster [i][2] +" %");
										angkamaster	[i][3]	= angkamaster [i][1];
									}
									System.out.println ("");
								
						}
					break;
					case 3:
						System.out.println ("========== Data Costumer  ==========");
						System.out.print ("Masukan Jumlah Costumer \t: ");
						N = Integer.parseInt (input.readLine());
						
						costumer  = new String [N][7];
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Costumer ke " +(i+1)+"\t: ");
							costumer [i][0]	= input.readLine ();
							System.out.print ("Masukkan Nama Costumer ke " +(i+1)+"\t: ");
							costumer [i][1]	= input.readLine ();
							System.out.print ("Masukkan Alamat Costumer ke " +(i+1)+"\t: ");
							costumer [i][2]	= input.readLine ();
							System.out.print ("Masukkan Telp/HP Costumer ke " +(i+1)+"\t: ");
							costumer [i][3]	= input.readLine ();
							System.out.print ("Masukkan Email Costumer ke " +(i+1)+"\t: ");
							costumer [i][4]	= input.readLine ();
							System.out.print ("Masukkan Kota Costumer ke " +(i+1)+"\t: ");
							costumer [i][5]	= input.readLine ();
							System.out.print ("Masukkan Jenis Custumer ke " +(i+1)+"\t: ");
							costumer [i][6]	= input.readLine ();
							System.out.println ("");
						}
						System.out.println ("========== Cetak Costumer ==========");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Customer ke "		+(i+1) +"\t:" +costumer [i][0]);
							System.out.println ("Nama Customer ke "		+(i+1) +"\t:" +costumer [i][1]);
							System.out.println ("Alamat Customer ke "	+(i+1) +"\t:" +costumer [i][2]);
							System.out.println ("Telp/HP Customer ke "	+(i+1) +"\t:" +costumer [i][3]);
							System.out.println ("Email Customer ke "	+(i+1) +"\t:" +costumer [i][4]);
							System.out.println ("Kota Costumer ke "		+(i+1) +"\t:" +costumer [i][5]);
							System.out.println ("Jenis Custumer ke "	+(i+1) +"\t:" +costumer [i][6]);
							System.out.println ("");
						}
					break;
					case 4:
						System.out.println ("========== Data Kota Tujuan  ==========");
						System.out.print ("Masukan Jumlah Kota Tujuan \t: ");
						N = Integer.parseInt (input.readLine());
						
						tujuan		= new String [N][2];
						ongkos		= new double [N][1];
						
						for (int i=0; i<N;i++){	
							System.out.print ("Masukkan Kode Kota ke " +(i+1)+"\t\t: ");
							tujuan [i][0] = input.readLine ();
							System.out.print ("Masukkan Kota Tujuan ke " +(i+1)+"\t: ");
							tujuan [i][1] = input.readLine ();
							System.out.print ("Masukkan Ongkos Kirim ke " +(i+1)+"\t: Rp. ");
							ongkos [i][0] = Double.parseDouble (input.readLine ());
							System.out.println ("");
						}
					break;
					case 5:
						System.out.println ("========== Data Transaksi ==========");
						System.out.print ("Masukan Jumlah Transaksi \t: ");
						N = Integer.parseInt (input.readLine());
						
						transaksi 	= new String [N][14];
						biaya		= new double [N][7];
						
						for (int i=0; i<N;i++){	
							System.out.print ("Masukkan Kode Transaksi ke " +(i+1)+"\t: ");
							transaksi [i][0] = input.readLine ();
							System.out.print ("Masukkan Tanggal Transaksi ke " +(i+1)+"\t: ");
							transaksi [i][1] = input.readLine ();
							System.out.print ("Masukkan Kode Costumer ke " +(i+1)+"\t: ");
							transaksi [i][2] = input.readLine ();
								if (costumer[i][0].equalsIgnoreCase (transaksi[i][2])){
									transaksi[i][3] = costumer[i][1];
									System.out.println ("Nama Costumer ke " +(i+1)+"\t\t: " 	+transaksi[i][3]);
									transaksi[i][4]	= costumer[i][2];
									System.out.println ("Alamat Costumer ke " +(i+1)+"\t\t: "  	+transaksi[i][4]);
									transaksi[i][5]	= costumer[i][3];
									System.out.println ("Email Costumer ke " +(i+1)+"\t\t: "  	+transaksi[i][5]);
									transaksi[i][6]	= costumer[i][4];
									System.out.println ("Telp/HP Costumer ke " +(i+1)+"\t\t: "	+transaksi[i][6]);
									transaksi[i][7]	= costumer[i][5];
									System.out.println ("Kota Costumer ke " +(i+1)+"\t\t: " 	+transaksi[i][7]);
								}
								else {
									System.out.println ("Perhatian\t\t\t: Maaf data costumer tidak ada");
								}
							System.out.print ("Masukkan Kode Barang ke " +(i+1)+"\t: ");
							transaksi [i][8] = input.readLine ();
								if (namamaster[i][0].equalsIgnoreCase (transaksi[i][8])){
									transaksi [i][9 ] = namamaster[i][1];
									System.out.println ("Kode Jenis Barang ke " +(i+1)+"\t\t: " +transaksi[i][9]);
									transaksi [i][10] = namamaster[i][2];
									System.out.println ("Nama Jenis Barang ke " +(i+1)+"\t\t: " +transaksi[i][10]);
									transaksi [i][11] = namamaster[i][3];
									System.out.println ("Nama Barang ke " +(i+1)+"\t\t: "		+transaksi[i][11]);
									
									biaya [i][0] = angkamaster	[i][0];
									System.out.println ("Berat Barang (gr) ke " +(i+1)+"\t\t: " +biaya[i][0]);
									biaya [i][1] = angkamaster	[i][1];
									System.out.println ("Total Harga Barang ke " +(i+1)+"\t\t: Rp."+biaya[i][1]);
									biaya [i][2] = angkamaster[i][2];
									System.out.println ("Diskon Barang ke " +(i+1)+"\t\t: Rp."	+biaya[i][2] +" %");
									
									biaya [i][3] = angkamaster [i][3];
									System.out.println ("Harga Setelah Diskon ke " +(i+1)+"\t: Rp."+biaya[i][3]);
									biaya [i][4] = ongkos [i][0];
									System.out.println ("Ongkos Kirim ke " +(i+1)+"\t\t: Rp."		+biaya[i][4]);
									
									System.out.print ("Status Pengiriman ke " +(i+1)+"\t\t: ");
									transaksi [i][12] = input.readLine ();
									System.out.print ("Nama Penerima Barang ke " +(i+1)+"\t: ");
									transaksi [i][13] = input.readLine();
									
									System.out.print ("Jumlah Kirim Barang ke " +(i+1)+"\t: ");
									biaya [i][5] = Double.parseDouble (input.readLine());
									
									biaya[i][6] = biaya [i][5]*(biaya[i][3]+biaya[i][4]);
									System.out.println ("Jumlah Harus Dibayar ke " +(i+1)+"\t: Rp. " +biaya[i][6]);
									System.out.println ("");
								}
						}
					break;
					case 6:
						System.out.println ("========= Cetak Data Jenis Barang =========");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Jenis Barang ke "	+(i+1) +"\t:" +jenisbarang [i][0]);
							System.out.println ("Jenis Barang ke "		+(i+1) +"\t:" +jenisbarang [i][1]);
							System.out.println ("");
						}
						System.out.println ("========= Cetak Data Master =========");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Barang ke "		+(i+1) +"\t:" +namamaster[i][0]);
							System.out.println ("Kode Jenis Barang ke "	+(i+1) +"\t:" +namamaster[i][1]);
							System.out.println ("Nama Jenis Barang ke "	+(i+1) +"\t:" +namamaster[i][2]);
							System.out.println ("Nama Barang ke "		+(i+1) +"\t:" +namamaster[i][3]);
							System.out.println ("Berat Barang (gr) ke "	+(i+1) +"\t:" +angkamaster[i][0]);
							System.out.println ("Harga Barang ke "		+(i+1) +"\t:Rp. " +angkamaster[i][1]);
							System.out.println ("Diskon Barang ke "		+(i+1) +"\t:" +angkamaster[i][2] +"%");
							System.out.println ("");
						}
						System.out.println ("========== Cetak Costumer ==========");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Customer ke "		+(i+1) +"\t:" +costumer [i][0]);
							System.out.println ("Nama Customer ke "		+(i+1) +"\t:" +costumer [i][1]);
							System.out.println ("Alamat Customer ke "	+(i+1) +"\t:" +costumer [i][2]);
							System.out.println ("Telp/HP Customer ke "	+(i+1) +"\t:" +costumer [i][3]);
							System.out.println ("Email Customer ke "	+(i+1) +"\t:" +costumer [i][4]);
							System.out.println ("Kota Costumer ke "		+(i+1) +"\t:" +costumer [i][5]);
							System.out.println ("");
						}
						System.out.println ("========= Cetak Kota Tujuan ==========");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Kota ke "			+(i+1) +"\t\t:"	  +tujuan [i][0]);
							System.out.println ("Kota Tujuan ke "		+(i+1) +"\t:"	  +tujuan [i][1]);
							System.out.println ("Ongkos Kirim ke "		+(i+1) +"\t:Rp. " +ongkos [i][0]);
							System.out.println ("");
						}
						System.out.println ("========= Cetak Transaksi Pengiriman ==========");
						for (int i=0; i<N; i++){
							System.out.println ("Kode Transaksi ke "			+(i+1)+"\t\t:"	+transaksi [i][0]);
							System.out.println ("Tanggal Transaksi ke "			+(i+1)+"\t\t:"	+transaksi [i][1]);
							System.out.println ("Kode Costumer ke "				+(i+1)+"\t\t:"	+transaksi [i][2]);
							System.out.println ("Nama Costumer ke "				+(i+1)+"\t\t:"	+transaksi [i][3]);
							System.out.println ("Alamat Costumer ke "			+(i+1)+"\t\t:"	+transaksi [i][4]);
							System.out.println ("Telp/HP Costumer ke "			+(i+1)+"\t\t:"	+transaksi [i][5]);
							System.out.println ("Email Costumer ke "			+(i+1)+"\t\t:"	+transaksi [i][6]);
							System.out.println ("Kota Costumer ke "				+(i+1)+"\t\t:"	+transaksi [i][7]);
							System.out.println ("Kode Barang  ke "				+(i+1)+"\t\t:"	+transaksi [i][8]);
							System.out.println ("Kode Jenis Barang  ke "		+(i+1)+"\t\t:"	+transaksi [i][9]);
							System.out.println ("Nama Jenis Barang  ke "		+(i+1)+"\t\t:"	+transaksi [i][10]);
							System.out.println ("Nama Barang  ke "				+(i+1)+"\t\t:"	+transaksi [i][11]);
							System.out.println ("Berat Barang  ke "				+(i+1)+"\t\t:"	+biaya [i][0]);
							System.out.println ("Total Harga Barang  ke "		+(i+1)+"\t:Rp."	+biaya [i][1]);
							System.out.println ("Diskon Barang ke "				+(i+1)+"\t\t:Rp."	+biaya [i][2]);
							System.out.println ("Total Harga Setelah Diskon ke "+(i+1)+"\t:Rp."	+biaya [i][3]);
							System.out.println ("Ongkos Kirim "					+(i+1)+"\t\t\t: Rp."+biaya [i][4]);
							System.out.println ("Status Pengiriman Barang  ke "	+(i+1)+"\t:"	+transaksi [i][12]);
							System.out.println ("Nama Penerima Barang  ke "		+(i+1)+"\t:"	+transaksi [i][13]);
							System.out.println ("Jumlah Pengiriman ke "			+(i+1)+"\t\t:"	+biaya [i][5]);
							System.out.println ("Jumlah Pembayaran ke "			+(i+1)+"\t\t:"	+biaya [i][6]);
							System.out.println ("");
						}
					break;
					case 7:
						System.out.print ("Masukkan Tanggal Transkaksi : ");
						tanggal = input.readLine();
						for (int i=0 ;i<transaksi.length; i++) {
							if(transaksi [i][1].equalsIgnoreCase(tanggal)){
								System.out.println("============================================");
								System.out.println ("Kode Costumer ke "				+(i+1)+"\t\t:"	+transaksi [i][2]);
								System.out.println ("Nama Costumer ke "				+(i+1)+"\t\t:"	+transaksi [i][3]);
								System.out.println ("Alamat Costumer ke "			+(i+1)+"\t\t:"	+transaksi [i][4]);
								System.out.println ("Telp/HP Costumer ke "			+(i+1)+"\t\t:"	+transaksi [i][5]);
								System.out.println ("Email Costumer ke "			+(i+1)+"\t\t:"	+transaksi [i][6]);
								System.out.println ("Kota Costumer ke "				+(i+1)+"\t\t:"	+transaksi [i][7]);
								System.out.println ("Kode Barang  ke "				+(i+1)+"\t\t:"	+transaksi [i][8]);
								System.out.println ("Kode Jenis Barang  ke "		+(i+1)+"\t\t:"	+transaksi [i][9]);
								System.out.println ("Nama Jenis Barang  ke "		+(i+1)+"\t\t:"	+transaksi [i][10]);
								System.out.println ("Nama Barang  ke "				+(i+1)+"\t\t:"	+transaksi [i][11]);
								System.out.println ("Berat Barang  ke "				+(i+1)+"\t\t:"	+biaya [i][0]);
								System.out.println ("Total Harga Barang  ke "		+(i+1)+"\t:"	+biaya [i][1]);
								System.out.println ("Diskon Barang ke "				+(i+1)+"\t\t:"	+biaya [i][2]);
								System.out.println ("Total Harga Setelah Diskon ke "+(i+1)+"\t:"	+biaya [i][3]);
								System.out.println ("Ongkos Kirim "					+(i+1)+"\t\t\t:"+biaya [i][4]);
								System.out.println ("Status Pengiriman Barang  ke "	+(i+1)+"\t:"	+transaksi [i][12]);
								System.out.println ("Nama Penerima Barang  ke "		+(i+1)+"\t:"	+transaksi [i][13]);
								System.out.println ("Jumlah Pengiriman ke "			+(i+1)+"\t\t:"	+biaya [i][5]);
								System.out.println ("Jumlah Pembayaran ke "			+(i+1)+"\t\t:"	+biaya [i][6]);
								System.out.println("============================================");
							}
						}
					break;
					case 8:
						System.exit(0);
					break;
				}
			} while (true);
		}
	}