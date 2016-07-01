import java.io.*;

	public class kelompok {
		public static void main (String [] agrs) throws Exception {
			BufferedReader input = new BufferedReader ( new InputStreamReader (System.in));
			
			//Deklarasi
			
			int N = 0;
			double total=0;
			double diskon = 0;
			double hargahd = 0;			
			String tanggal;
			
			do {
				
				System.out.println ("==========Hypernart==========");
				System.out.println ("1. Data Jenis Barang");
				System.out.println ("2. Data Master");
				System.out.println ("3. Data Customer");
				System.out.println ("4. Data Kota Tujuan");
				System.out.println ("5. Transaksi Pengiriman");
				System.out.println ("6. Cetak Laporan");
				System.out.println ("7. Exit");
				System.out.print ("Masukan Pilihan Menu Anda : ");
				int pilih = Integer.parseInt(input.readLine ());
				
				String [][] jenisbarang = new String [0][0];
				String [][] datacostumer = new String [0][6];
				String [][] datakotatujuan = new String [0][3];
				String [][] datatransaksi = new String [0][4];
				String [][] kodemaster = new String [0][0];
				int [][] ongkoskirim = new int [0][1];
				int [][] datamaster = new int [0][3];
			
				switch (pilih) {
					case 1:
						System.out.print ("Masukkan Jumlah Barang :");
						N = Integer.parseInt(input.readLine ());
						
						jenisbarang = new String [N][2];
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Jenis Barang	: ");
							jenisbarang [i][0] = input.readLine ();
							System.out.print ("Masukkan Jenis Barang 		: ");
							jenisbarang [i][1] = input.readLine ();
								
						}
					break;
					case 2:
						System.out.print ("Masukan Jumlah Barang :");
						N = Integer.parseInt(input.readLine ());
						
						kodemaster = new String [N][3];
						datamaster = new int [N][3];
						
						for(int i=0; i<N; i++) {
							System.out.print ("Masukkan Kode Barang  	: ");
							kodemaster [i][0] = input.readLine ();
							System.out.print ("Masukkan Kode Jenis Barang  	: ");
							kodemaster [i][1] = input.readLine ();
							System.out.print ("Masukkan Nama Barang  	: ");
							kodemaster [i][2] = input.readLine ();			
						}
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukan Berat Barang  	: ");
							datamaster [i][0] = Integer.parseInt(input.readLine ());
							System.out.print ("Masukan Harga Per Barang  : ");
							datamaster [i][1] = Integer.parseInt(input.readLine ());
								if (kodemaster [i][1].equalsIgnoreCase ("wn")){
										diskon = 0.4;
										hargahd = datamaster[i][1]-(datamaster[i][1]*diskon);

								} 
								else {
										diskon = 0;
								} 
						}
					break;
					case 3:
						for (int i=0 ;i<N; i++) {
							for (int j=0; j<6;j++){
								System.out.print ("Masukan Data Costumer ["+i+"]["+j+"] ");
								datacostumer [i][j] = input.readLine ();
							}
						}
					break;
					case 4:
						for (int i=0 ;i<N; i++) {
							for (int j=0; j<2;j++){
								System.out.print ("Masukan Kota Tujuan ["+i+"]["+j+"] ");
								datakotatujuan [i][j] = input.readLine ();
							}
						}
						for (int i=0 ;i<N; i++) {
							for (int j=0; j<1;j++){
								System.out.print ("Masukan Ongkos Kirim ["+i+"]["+j+"] ");
								ongkoskirim [i][j] = Integer.parseInt (input.readLine ());
							}
						}
					break;
					case 5:
						System.out.println ("====================================================");
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukan Kode Transaksi	  	: ");
							datatransaksi [i][0] = input.readLine ();
							System.out.print ("Masukan Tanggal Transaksi  	: ");
							datatransaksi [i][1] = input.readLine ();
							System.out.print ("Masukan Status Pengiriman  	: ");
							datatransaksi [i][2] = input.readLine ();
							System.out.print ("Masukan Nama Penerima Barang	: ");
							datatransaksi [i][3] = input.readLine ();
						}
						
						System.out.println ("====================================================");
						for (int i=0 ;i<N; i++) {
							for (int j=0; j<6;j++){
								System.out.println ("Data Costumer :  " +datacostumer [i][j]);
							}
						}
						System.out.println ("====================================================");
						for (int i=0 ;i<N; i++) {
							for (int j=0; j<1;j++){
								System.out.println ("Ongkos Kirim Anda :" +ongkoskirim[i][j]);
							}
						}
						System.out.println ("====================================================");
						for (int i=0 ;i<N; i++) {
							for (int j=0; j<3;j++){
								total = total + datamaster [i][1];
							}
						}
							System.out.println ("Total Harga :" +total);
						System.out.println ("====================================================");
					break;
					case 6:
					try {
						System.out.print ("Masukan Tanggal Transkaksi : ");
						tanggal = input.readLine();
						for (int i=0 ;i<datatransaksi.length; i++) {
							if(datatransaksi [i][1].equalsIgnoreCase(tanggal)){
								System.out.println("============================================");
								System.out.println( "Kode Transaksi			: "+datatransaksi [i][0]);
								System.out.println("Tanggal Transaksi		: "+datatransaksi [i][1]);
								System.out.println("Status Pengiriman		: "+datatransaksi [i][2]);
								System.out.println("Nama Penerima Barang	: "+datatransaksi [i][3]);
								System.out.println("============================================");
							}
						}
						
					} catch(Exception e){
						System.out.println ("");
						System.out.println ("Data Belom Diisi");
						System.out.println ("");
						
					}
					break;
					case 7:
						System.exit(0);
						break;
						default:
						System.out.println ("Pilihan Menu hanya ada 1 - 7");
				}
			} while (true);
			
		}
	}