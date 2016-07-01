import java.util.Vector;
import java.io.*;

	public class uas1 {
		public static void main (String [] agrs) throws Exception {
			BufferedReader input = new BufferedReader ( new InputStreamReader (System.in));
			
			//deklarasi
			int N = 0;
			String tanggal;	
			//case1
			Vector barang1 = new Vector ();
			Vector barang2 = new Vector ();
			//case2
			Vector master1 = new Vector ();
			Vector master2 = new Vector ();
			Vector master3 = new Vector ();
			Vector master4 = new Vector ();
			Vector master5 = new Vector ();
			Vector master6 = new Vector ();
			Vector master7 = new Vector ();
			Vector master8 = new Vector ();
			//case3
			Vector customer1 = new Vector ();
			Vector customer2 = new Vector ();
			Vector customer3 = new Vector ();
			Vector customer4 = new Vector ();
			Vector customer5 = new Vector ();
			Vector customer6 = new Vector ();
			//case4
			Vector kota1 = new Vector ();
			Vector kota2 = new Vector ();
			Vector kota3 = new Vector ();
			//case5
			Vector transaksi1  = new Vector ();
			Vector transaksi2  = new Vector ();
			Vector transaksi3  = new Vector ();
			Vector transaksi4  = new Vector ();
			Vector transaksi5  = new Vector ();
			Vector transaksi6  = new Vector ();
			Vector transaksi7  = new Vector ();
			Vector transaksi8  = new Vector ();
			Vector transaksi9  = new Vector ();
			Vector transaksi10 = new Vector ();
			Vector transaksi11 = new Vector ();
			Vector transaksi12 = new Vector ();
			Vector transaksi13 = new Vector ();
			Vector transaksi14 = new Vector ();
			Vector transaksi15 = new Vector ();
			Vector transaksi16 = new Vector ();
			Vector transaksi17 = new Vector ();
			Vector transaksi18 = new Vector ();
			Vector transaksi19 = new Vector ();
			Vector transaksi20 = new Vector ();
			Vector transaksi21 = new Vector ();
			//note
			Vector note = new Vector ();
			
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
					//insert
						System.out.println ("========== Data Jenis Barang ==========");
						System.out.print ("Masukan Jumlah Barang\t\t: ");
						N = Integer.parseInt (input.readLine());
						
						barang1 = new Vector ();
						barang2 = new Vector ();
						String hapus = "";
						String hapus1 = "";
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Jenis Barang ke " +(i+1)+"\t: ");
							barang1.addElement (input.readLine());
							System.out.print ("Masukkan Jenis Barang ke " +(i+1)+"\t: ");
							barang2.addElement (input.readLine());
						}
						//hapus atau update
						System.out.print ("Pilihan (Hapus/Update/Lanjut)\t: ");
						hapus = input.readLine();
						if (hapus.equalsIgnoreCase("hapus")) {
							System.out.print ("Masukkan Kode Jenis yg dihapus\t: ");
							hapus1 = input.readLine();
							int index = barang1.indexOf(hapus1);
							barang1.remove (index);
							barang2.remove (index);
							System.out.println ("");
							System.out.println ("========= Cetak Hapus Jenis Barang =========");
							for (int i=0; i<barang1.size(); i++){
								System.out.println ("Kode Jenis Barang ke "	+(i+1) +"\t: " +barang1.elementAt(i));
								System.out.println ("Jenis Barang ke "		+(i+1) +"\t: " +barang2.elementAt(i));
							}
							
						} else if (hapus.equalsIgnoreCase("update")) {
							//hapus
							System.out.print ("Masukkan Kode Jenis yg diupdate\t: ");
							hapus1 = input.readLine();
							int index = barang1.indexOf(hapus1);
							barang1.remove (index);
							barang2.remove (index);
							//masuk
							System.out.print ("Masukkan Kode Jenis Barang Baru\t: ");
							barang1.insertElementAt (input.readLine(),index);
							System.out.print ("Masukkan Jenis Barang Baru\t: ");
							barang2.insertElementAt (input.readLine(),index);
							System.out.println ("");
							System.out.println ("========= Cetak Update Jenis Barang =========");
							for (int i=0; i<N; i++){
								System.out.println ("Kode Jenis Barang ke "	+(i+1) +"\t: " +barang1.elementAt(i));
								System.out.println ("Jenis Barang ke "		+(i+1) +"\t: " +barang2.elementAt(i));
							}
							
						} else {
							System.out.print ("Terima Kasih");
						}
					break;
					case 2:
						System.out.println ("========== Data Master Barang ==========");
						System.out.print ("Masukan Jumlah Data Barang \t: ");
						N = Integer.parseInt (input.readLine());
						
						master1 = new Vector ();
						master2 = new Vector ();
						master3 = new Vector ();
						master4 = new Vector ();
						master5 = new Vector ();
						master6 = new Vector ();
						master7 = new Vector ();
						master8 = new Vector ();
						
						String namajenisbrg = "";
						String master2input = "";
						double diskon = 0;
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Barang ke " +(i+1)+"\t: ");
							master1.addElement (input.readLine ());
							System.out.print ("Masukkan Kode Jenis Barang ke " +(i+1)+"\t: ");
							master2input = input.readLine ();
								for(int j = 0; j<barang1.size(); j++){	
									if ((barang1.elementAt(j)).equals (master2input)){
										namajenisbrg = String.valueOf (barang2.elementAt(j));
									}
								}	
							master2.addElement (master2input);
							master3.addElement (namajenisbrg);
							System.out.println ("Nama Jenis Barang\t\t: "+master3.elementAt(i));
							
							System.out.print ("Masukkan Nama Barang ke " +(i+1)+"\t: ");
							master4.addElement (input.readLine ());
							System.out.print ("Masukkan Berat Barang (gr) ke " +(i+1)+"\t: ");
							master5.addElement (input.readLine ());
							System.out.print ("Masukkan Harga per Barang ke " +(i+1)+"\t: Rp." );
							master6.addElement (input.readLine ());
							System.out.print ("Masukkan Diskon per Barang ke " +(i+1)+"\t: " );
							master7.addElement (input.readLine ());
							
							diskon = Double.parseDouble(master6.elementAt(i).toString())-(Double.parseDouble(master6.elementAt(i).toString())*(Double.parseDouble(master7.elementAt(i).toString())/100));
							
							master8.addElement (diskon);
							System.out.println ("Harga Setelah Diskon Sebesar\t: " +master8.elementAt(i));
						}
						//hapus atau update
						System.out.print ("Pilihan (Hapus/Update/Lanjut)\t: ");
						hapus = input.readLine();
						if (hapus.equalsIgnoreCase("hapus")) {
							System.out.print ("Masukkan Kode Barang yg dihapus\t: ");
							hapus1 = input.readLine();
							int index = master1.indexOf(hapus1);
							master1.remove (index);
							master2.remove (index);
							master3.remove (index);
							master4.remove (index);
							master5.remove (index);
							master6.remove (index);
							master7.remove (index);
							master8.remove (index);
							System.out.println ("");
							System.out.println ("========= Cetak Data Master =========");
							for (int i=0; i<master1.size(); i++){
								System.out.println ("Kode Barang ke "		+(i+1) +"\t: " +master1.elementAt(i));
								System.out.println ("Kode Jenis Barang ke "	+(i+1) +"\t: " +master2.elementAt(i));
								System.out.println ("Nama Jenis Barang ke "	+(i+1) +"\t: " +master3.elementAt(i));
								System.out.println ("Nama Barang ke "		+(i+1) +"\t: " +master4.elementAt(i));
								System.out.println ("Berat Barang (gr) ke "	+(i+1) +"\t: " +master5.elementAt(i));
								System.out.println ("Harga Barang ke "		+(i+1) +"\t: Rp. " +master6.elementAt(i));
								System.out.println ("Diskon Barang ke "		+(i+1) +"\t: " +master7.elementAt(i) +"%");
								System.out.println ("");
							}
							
						} else if (hapus.equalsIgnoreCase("update")) {
							//hapus
							System.out.print ("Masukkan Kode Barang yg diupdate: ");
							hapus1 = input.readLine();
							int index = master1.indexOf(hapus1);
							master1.remove (index);
							master2.remove (index);
							master3.remove (index);
							master4.remove (index);
							master5.remove (index);
							master6.remove (index);
							master7.remove (index);
							master8.remove (index);
							//masuk
							for (int i=0 ;i<N; i++) {
								System.out.print ("Masukkan Kode Barang Baru\t: ");
								master1.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Kode Jenis Barang Baru\t: ");
								master2input = input.readLine ();
									for(int j = 0; j<barang1.size(); j++){	
										if ((barang1.elementAt(j)).equals (master2input)){
											namajenisbrg = String.valueOf (barang2.elementAt(j));
										}
									}	
								master2.addElement (master2input);
								master3.addElement (namajenisbrg);
								System.out.println ("Nama Jenis Barang Baru\t\t: "+master3.elementAt(i));
								
								System.out.print ("Masukkan Nama Barang Baru\t: ");
								master4.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Berat Barang (gr) Baru\t: ");
								master5.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Harga per Barang Baru\t: Rp." );
								master6.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Diskon per Barang Baru\t: " );
								master7.insertElementAt (input.readLine(),index);
								
								diskon = Double.parseDouble(master6.elementAt(i).toString())-(Double.parseDouble(master6.elementAt(i).toString())*(Double.parseDouble(master7.elementAt(i).toString())/100));
								
								master8.addElement (diskon);
								System.out.println ("Harga Setelah Diskon Baru\t: " +master8.elementAt(i));
								System.out.println ("");
							}
							System.out.println ("");
							System.out.println ("========= Cetak Data Master =========");
							for (int i=0; i<master1.size(); i++){
								System.out.println ("Kode Barang ke "		+(i+1) +"\t: " +master1.elementAt(i));
								System.out.println ("Kode Jenis Barang ke "	+(i+1) +"\t: " +master2.elementAt(i));
								System.out.println ("Nama Jenis Barang ke "	+(i+1) +"\t: " +master3.elementAt(i));
								System.out.println ("Nama Barang ke "		+(i+1) +"\t: " +master4.elementAt(i));
								System.out.println ("Berat Barang (gr) ke "	+(i+1) +"\t: " +master5.elementAt(i));
								System.out.println ("Harga Barang ke "		+(i+1) +"\t: Rp. " +master6.elementAt(i));
								System.out.println ("Diskon Barang ke "		+(i+1) +"\t: " +master7.elementAt(i) +"%");
								System.out.println ("");
							}
						}
						else {
							System.out.print ("Terima Kasih");
						}
					break;
					case 3:
						System.out.println ("========== Data Costumer  ==========");
						System.out.print ("Masukan Jumlah Costumer \t: ");
						N = Integer.parseInt (input.readLine());
						
						customer1 = new Vector ();
						customer2 = new Vector ();
						customer3 = new Vector ();
						customer4 = new Vector ();
						customer5 = new Vector ();
						customer6 = new Vector ();
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Costumer ke " +(i+1)+"\t: ");
							customer1.addElement (input.readLine());
							System.out.print ("Masukkan Nama Costumer ke " +(i+1)+"\t: ");
							customer2.addElement (input.readLine());
							System.out.print ("Masukkan Alamat Costumer ke " +(i+1)+"\t: ");
							customer3.addElement (input.readLine());
							System.out.print ("Masukkan Telp/HP Costumer ke " +(i+1)+"\t: ");
							customer4.addElement (input.readLine());
							System.out.print ("Masukkan Email Costumer ke " +(i+1)+"\t: ");
							customer5.addElement (input.readLine());
							System.out.print ("Masukkan Kota Costumer ke " +(i+1)+"\t: ");
							customer6.addElement (input.readLine());
						}
						
						//hapus atau update
						System.out.print ("Pilihan (Hapus/Update/Lanjut)\t: ");
						hapus = input.readLine();
						if (hapus.equalsIgnoreCase("hapus")) {
							System.out.print ("Masukkan Kode Costumer dihapus\t: ");
							hapus1 = input.readLine();
							int index = customer1.indexOf(hapus1);
							customer1.remove (index);
							customer2.remove (index);
							customer3.remove (index);
							customer4.remove (index);
							customer5.remove (index);
							customer6.remove (index);
							System.out.println ("");
							System.out.println ("========== Cetak Costumer ==========");
							for (int i=0; i<customer1.size(); i++){
								System.out.println ("Kode Customer ke "		+(i+1) +"\t: " +customer1.elementAt(i));
								System.out.println ("Nama Customer ke "		+(i+1) +"\t: " +customer2.elementAt(i));
								System.out.println ("Alamat Customer ke "	+(i+1) +"\t: " +customer3.elementAt(i));
								System.out.println ("Telp/HP Customer ke "	+(i+1) +"\t: " +customer4.elementAt(i));
								System.out.println ("Email Customer ke "	+(i+1) +"\t: " +customer5.elementAt(i));
								System.out.println ("Kota Costumer ke "		+(i+1) +"\t: " +customer6.elementAt(i));
							}
							
						} else if (hapus.equalsIgnoreCase("update")) {
							//hapus
							System.out.print ("Masukkan Kode Costumer diupdate\t: ");
							hapus1 = input.readLine();
							int index = customer1.indexOf(hapus1);
							customer1.remove (index);
							customer2.remove (index);
							customer3.remove (index);
							customer4.remove (index);
							customer5.remove (index);
							customer6.remove (index);
							//masuk
							
							for (int i=0 ;i<customer1.size(); i++) {
								System.out.print ("Masukkan Kode Costumer Baru\t: ");
								customer1.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Nama Costumer Baru\t: ");
								customer2.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Alamat Costumert Baru\t: ");
								customer3.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Telp/HP Costumer Baru\t: ");
								customer4.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Email Costumer Baru\t: ");
								customer5.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Kota Costumer Baru\t: ");
								customer6.insertElementAt (input.readLine(),index);
							}
							System.out.println ("");
							System.out.println ("========== Cetak Costumer ==========");
							for (int i=0; i<customer1.size(); i++){
								System.out.println ("Kode Customer ke "		+(i+1) +"\t: " +customer1.elementAt(i));
								System.out.println ("Nama Customer ke "		+(i+1) +"\t: " +customer2.elementAt(i));
								System.out.println ("Alamat Customer ke "	+(i+1) +"\t: " +customer3.elementAt(i));
								System.out.println ("Telp/HP Customer ke "	+(i+1) +"\t: " +customer4.elementAt(i));
								System.out.println ("Email Customer ke "	+(i+1) +"\t: " +customer5.elementAt(i));
								System.out.println ("Kota Costumer ke "		+(i+1) +"\t: " +customer6.elementAt(i));
							}
							
						} else {
							System.out.print ("Terima Kasih");
						}
					break;
					case 4:
						System.out.println ("========== Data Kota Tujuan  ==========");
						System.out.print ("Masukan Jumlah Kota Tujuan \t: ");
						N = Integer.parseInt (input.readLine());
						
						kota1 = new Vector ();
						kota2 = new Vector ();
						kota3 = new Vector ();
						
						for (int i=0; i<N;i++){	
							System.out.print ("Masukkan Kode Kota ke " +(i+1)+"\t\t: ");
							kota1.addElement (input.readLine());
							System.out.print ("Masukkan Kota Tujuan ke " +(i+1)+"\t: ");
							kota2.addElement (input.readLine());
							System.out.print ("Masukkan Ongkos Kirim ke " +(i+1)+"\t: Rp. ");
							kota3.addElement (input.readLine());
						}
						
						//hapus atau update
						System.out.print ("Pilihan (Hapus/Update/Lanjut)\t: ");
						hapus = input.readLine();
						if (hapus.equalsIgnoreCase("hapus")) {
							System.out.print ("Masukkan Kode Kota yg dihapus\t: ");
							hapus1 = input.readLine();
							int index = kota1.indexOf(hapus1);
							kota1.remove (index);
							kota2.remove (index);
							kota3.remove (index);
							
							System.out.println ("");
							System.out.println ("========= Cetak Kota Tujuan ==========");
							for (int i=0; i<kota1.size(); i++){
								System.out.println ("Kode Kota ke "			+(i+1) +"\t\t: "	+kota1.elementAt(i));
								System.out.println ("Kota Tujuan ke "		+(i+1) +"\t: "		+kota2.elementAt(i));
								System.out.println ("Ongkos Kirim ke "		+(i+1) +"\t: Rp. "	+kota3.elementAt(i));
							}
														
						} else if (hapus.equalsIgnoreCase("update")) {
							//hapus
							System.out.print ("Masukkan Kode Kota yg diupdate\t: ");
							hapus1 = input.readLine();
							int index = kota1.indexOf(hapus1);
							kota1.remove (index);
							kota2.remove (index);
							kota3.remove (index);
							//masuk
							for (int i=0; i<N;i++){	
								System.out.print ("Masukkan Kode Kota\t\t: ");
								kota1.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Kota Tujuan\t: ");
								kota2.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Ongkos Kirim\t: Rp. ");
								kota3.insertElementAt (input.readLine(),index);
								System.out.println ("");
								System.out.println ("========= Cetak Kota Tujuan ==========");
							}
							for (int i=0; i<kota1.size(); i++){
								System.out.println ("Kode Kota ke "			+(i+1) +"\t\t: "	+kota1.elementAt(i));
								System.out.println ("Kota Tujuan ke "		+(i+1) +"\t: "		+kota2.elementAt(i));
								System.out.println ("Ongkos Kirim ke "		+(i+1) +"\t: Rp. "	+kota3.elementAt(i));
							}
						} else {
								System.out.print ("Terima Kasih");
						}						
					break;
					case 5:
						System.out.println ("========== Data Transaksi ==========");
						System.out.print ("Masukan Jumlah Transaksi \t: ");
						N = Integer.parseInt (input.readLine());
						
						String cus1 = "";
						String cus2 = "kosong";
						String cus3 = "kosong";
						String cus4 = "kosong";
						String cus5 = "kosong";
						String cus6 = "kosong";
						
						String mas1 = "kosong";
						String mas2 = "kosong";
						String mas3 = "kosong";
						String mas4 = "kosong";
						String mas5 = "kosong";
						String mas6 = "kosong";
						String mas7 = "0";
						String mas8 = "0";
						
						String kot1 = "0";
						
						double biaya = 0;
						
						for (int i=0; i<N;i++){	
							System.out.print ("Masukkan Kode Transaksi ke " +(i+1)+"\t: ");
							transaksi1.addElement (input.readLine());
							System.out.print ("Masukkan Tanggal Transaksi ke " +(i+1)+"\t: ");
							transaksi2.addElement (input.readLine());
							//mulai
							System.out.print ("Masukkan Kode Costumer ke " +(i+1)+"\t: ");
							cus1 = input.readLine ();
							for(int j = 0; j<customer1.size(); j++){	
								if ((customer1.elementAt(j)).equals (cus1)){
									cus2 = String.valueOf (customer2.elementAt(j));
									cus3 = String.valueOf (customer3.elementAt(j));
									cus4 = String.valueOf (customer4.elementAt(j));
									cus5 = String.valueOf (customer5.elementAt(j));
									cus6 = String.valueOf (customer6.elementAt(j));
								}
							}
							transaksi3.addElement (cus1);
							transaksi4.addElement (cus2);
							transaksi5.addElement (cus3);
							transaksi6.addElement (cus4);
							transaksi7.addElement (cus5);
							transaksi8.addElement (cus6);
							System.out.println ("Nama Costumer ke " +(i+1)+"\t\t: " 	+transaksi4.elementAt(i));
							System.out.println ("Alamat Costumer ke " +(i+1)+"\t\t: "  	+transaksi5.elementAt(i));
							System.out.println ("Email Costumer ke " +(i+1)+"\t\t: "  	+transaksi6.elementAt(i));	
							System.out.println ("Telp/HP Costumer ke " +(i+1)+"\t\t: "	+transaksi7.elementAt(i));
							System.out.println ("Kota Costumer ke " +(i+1)+"\t\t: " 	+transaksi8.elementAt(i));
							
							System.out.print ("Masukkan Kode Barang ke " +(i+1)+"\t: ");
							mas1 = input.readLine ();
							for(int j = 0; j<master1.size(); j++){
								if ((master1.elementAt(j)).equals (mas1)){
									mas2 = String.valueOf (master2.elementAt(j));
									mas3 = String.valueOf (master3.elementAt(j));
									mas4 = String.valueOf (master4.elementAt(j));
									mas5 = String.valueOf (master5.elementAt(j));
									mas6 = String.valueOf (master6.elementAt(j));
									mas7 = String.valueOf (master7.elementAt(j));
									mas8 = String.valueOf (master8.elementAt(j));
								}
								if ((kota1.elementAt(j)).equals (mas1)){
									kot1 = String.valueOf (kota3.elementAt(j));
								}
							}
							
							transaksi9.addElement  (mas1);
							transaksi10.addElement (mas2);
							transaksi11.addElement (mas3);
							transaksi12.addElement (mas4);
							transaksi13.addElement (mas5);
							transaksi14.addElement (mas6);
							transaksi15.addElement (mas7);
							transaksi16.addElement (mas8);
							transaksi17.addElement (kot1);
							System.out.println ("Kode Jenis Barang ke " +(i+1)+"\t\t: "		+transaksi10.elementAt(i));
							System.out.println ("Nama Jenis Barang ke " +(i+1)+"\t\t: "		+transaksi11.elementAt(i));
							System.out.println ("Nama Barang ke " +(i+1)+"\t\t: "			+transaksi12.elementAt(i));
							System.out.println ("Berat Barang (gr) ke " +(i+1)+"\t\t: "		+transaksi13.elementAt(i));
							System.out.println ("Total Harga Barang ke " +(i+1)+"\t\t: Rp."	+transaksi14.elementAt(i));
							System.out.println ("Diskon Barang ke " +(i+1)+"\t\t: Rp."		+transaksi15.elementAt(i) +" %");
							System.out.println ("Harga Setelah Diskon ke " +(i+1)+"\t: Rp."	+transaksi16.elementAt(i));
							System.out.println ("Ongkos Kirim ke " +(i+1)+"\t\t: Rp."		+transaksi17.elementAt(i));
							
							System.out.print ("Status Pengiriman ke " +(i+1)+"\t\t: ");
							transaksi18.addElement (input.readLine ());
							System.out.print ("Nama Penerima Barang ke " +(i+1)+"\t: ");
							transaksi19.addElement (input.readLine ());
							System.out.print ("Jumlah Kirim Barang ke " +(i+1)+"\t: ");
							transaksi20.addElement (input.readLine ());
							
							biaya = ((Double.parseDouble(transaksi20.elementAt(i).toString()))*(Double.parseDouble(transaksi16.elementAt(i).toString()))) + Double.parseDouble(transaksi17.elementAt(i).toString());
									
							transaksi21.addElement (biaya);
							System.out.println ("Jumlah Harus Dibayar ke " +(i+1)+"\t: Rp. " +transaksi21.elementAt(i));
						}
						//hapus atau update
						System.out.print ("Pilihan (Hapus/Update/Lanjut)\t: ");
						hapus = input.readLine();
						if (hapus.equalsIgnoreCase("hapus")) {
							System.out.print ("Masukkan Kode transaksi yg dihapus\t: ");
							hapus1 = input.readLine();
							int index = transaksi1.indexOf(hapus1);
							transaksi1.remove  (index);
							transaksi2.remove  (index);
							transaksi3.remove  (index);
							transaksi4.remove  (index);
							transaksi5.remove  (index);
							transaksi6.remove  (index);
							transaksi7.remove  (index);
							transaksi8.remove  (index);
							transaksi9.remove  (index);
							transaksi10.remove (index);
							transaksi11.remove (index);
							transaksi12.remove (index);
							transaksi13.remove (index);
							transaksi14.remove (index);
							transaksi15.remove (index);
							transaksi16.remove (index);
							transaksi17.remove (index);
							transaksi18.remove (index);
							transaksi19.remove (index);
							transaksi20.remove (index);
							transaksi21.remove (index);
							
							System.out.println ("");
							System.out.println ("========= Cetak Transaksi Pengiriman ==========");
							for (int i=0; i<N; i++){
								System.out.println ("Kode Transaksi ke "			+(i+1)+"\t\t: "	+transaksi1.elementAt(i));
								System.out.println ("Tanggal Transaksi ke "			+(i+1)+"\t\t: "	+transaksi2.elementAt(i));
								System.out.println ("Kode Costumer ke "				+(i+1)+"\t\t: "	+transaksi3.elementAt(i));
								System.out.println ("Nama Costumer ke "				+(i+1)+"\t\t: "	+transaksi4.elementAt(i));
								System.out.println ("Alamat Costumer ke "			+(i+1)+"\t\t: "	+transaksi5.elementAt(i));
								System.out.println ("Telp/HP Costumer ke "			+(i+1)+"\t\t: "	+transaksi6.elementAt(i));
								System.out.println ("Email Costumer ke "			+(i+1)+"\t\t: "	+transaksi7.elementAt(i));
								System.out.println ("Kota Costumer ke "				+(i+1)+"\t\t: "	+transaksi8.elementAt(i));
								System.out.println ("Kode Barang  ke "				+(i+1)+"\t\t: "	+transaksi9.elementAt(i));
								System.out.println ("Kode Jenis Barang  ke "		+(i+1)+"\t\t: "	+transaksi10.elementAt(i));
								System.out.println ("Nama Jenis Barang  ke "		+(i+1)+"\t\t: "	+transaksi11.elementAt(i));
								System.out.println ("Nama Barang  ke "				+(i+1)+"\t\t: "	+transaksi12.elementAt(i));
								System.out.println ("Berat Barang  ke "				+(i+1)+"\t\t: "	+transaksi13.elementAt(i));
								System.out.println ("Total Harga Barang  ke "		+(i+1)+"\t: Rp."	+transaksi14.elementAt(i));
								System.out.println ("Diskon Barang ke "				+(i+1)+"\t\t: Rp."	+transaksi15.elementAt(i));
								System.out.println ("Total Harga Setelah Diskon ke "+(i+1)+"\t: Rp."	+transaksi16.elementAt(i));
								System.out.println ("Ongkos Kirim "					+(i+1)+"\t\t\t: Rp."+transaksi17.elementAt(i));
								System.out.println ("Status Pengiriman Barang  ke "	+(i+1)+"\t: "	+transaksi18.elementAt(i));
								System.out.println ("Nama Penerima Barang  ke "		+(i+1)+"\t: "	+transaksi19.elementAt(i));
								System.out.println ("Jumlah Pengiriman ke "			+(i+1)+"\t\t: "	+transaksi20.elementAt(i));
								System.out.println ("Jumlah Pembayaran ke "			+(i+1)+"\t\t: "	+transaksi21.elementAt(i));
								System.out.println ("");
							}			
						} else if (hapus.equalsIgnoreCase("update")) {
							//hapus
							System.out.print ("Masukkan Kode transaksi yg diupdate\t: ");
							hapus1 = input.readLine();
							int index = transaksi1.indexOf(hapus1);
							transaksi1.remove  (index);
							transaksi2.remove  (index);
							transaksi3.remove  (index);
							transaksi4.remove  (index);
							transaksi5.remove  (index);
							transaksi6.remove  (index);
							transaksi7.remove  (index);
							transaksi8.remove  (index);
							transaksi9.remove  (index);
							transaksi10.remove (index);
							transaksi11.remove (index);
							transaksi12.remove (index);
							transaksi13.remove (index);
							transaksi14.remove (index);
							transaksi15.remove (index);
							transaksi16.remove (index);
							transaksi17.remove (index);
							transaksi18.remove (index);
							transaksi19.remove (index);
							transaksi20.remove (index);
							transaksi21.remove (index);
							//masuk
							for (int i=0; i<N;i++){	
								System.out.print ("Masukkan Kode Transaksi Baru\t: ");
								transaksi1.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Tanggal Transaksi Baru\t: ");
								transaksi2.insertElementAt (input.readLine(),index);
								System.out.print ("Masukkan Kode Costumer Baru\t: ");
								transaksi3.insertElementAt (input.readLine(),index);
									if (customer1.equals (transaksi3)){
										transaksi4 = customer2;
										System.out.println ("Nama Costumer ke " +(i+1)+"\t\t: " 	+transaksi4.elementAt(i));
										transaksi5	= customer3;
										System.out.println ("Alamat Costumer ke " +(i+1)+"\t\t: "  	+transaksi5.elementAt(i));
										transaksi6	= customer4;
										System.out.println ("Email Costumer ke " +(i+1)+"\t\t: "  	+transaksi6.elementAt(i));
										transaksi7	= customer5;
										System.out.println ("Telp/HP Costumer ke " +(i+1)+"\t\t: "	+transaksi7.elementAt(i));
										transaksi8	= customer6;
										System.out.println ("Kota Costumer ke " +(i+1)+"\t\t: " 	+transaksi8.elementAt(i));
									}
									else {
										System.out.println ("Perhatian\t\t\t: Maaf data costumer tidak ada");
									}
								
								System.out.print ("Masukkan Kode Barang Baru\t: ");
								transaksi9.insertElementAt (input.readLine(),index);
								
								for(int j = 0; j<customer1.size(); j++){
									if (master1.equals (transaksi9)){
										transaksi10 = master2;
										System.out.println ("Kode Jenis Barang Baru\t\t: " +transaksi10.elementAt(j));
										transaksi11 = master3;
										System.out.println ("Nama Jenis Barang Baru\t\t: " +transaksi11.elementAt(j));
										transaksi12 = master4;
										System.out.println ("Nama Barang Baru\t\t: "		+transaksi12.elementAt(j));
										
										transaksi13 = master5;
										System.out.println ("Berat Barang (gr) Baru\t\t: " +transaksi13.elementAt(j));
										transaksi14 = master6;
										System.out.println ("Total Harga Barang Baru\t\t: Rp."+transaksi14.elementAt(j));
										transaksi15 = master7;
										System.out.println ("Diskon Barang Baru\t\t: Rp."	+transaksi15.elementAt(j) +" %");
										
										transaksi16 = master8;
										System.out.println ("Harga Setelah DiskonBaru\t: Rp."+transaksi16.elementAt(j));
										transaksi17 = kota3;
										System.out.println ("Ongkos Kirim Baru\t\t: Rp."		+transaksi17.elementAt(j));
										
										System.out.print ("Status Pengiriman Baru\t\t: ");
										transaksi18.insertElementAt (input.readLine(),index);
										System.out.print ("Nama Penerima Barang Baru\t: ");
										transaksi19.insertElementAt (input.readLine(),index);
										
										System.out.print ("Jumlah Kirim Barang Baru\t: ");
										transaksi20.insertElementAt (input.readLine(),index);
										
										biaya = Double.parseDouble(transaksi20.elementAt(j).toString())*Double.parseDouble(transaksi16.elementAt(j).toString())+ Double.parseDouble(transaksi17.elementAt(j).toString());
										
										transaksi21.addElement (biaya);
										System.out.println ("Jumlah Harus Dibayar Baru\t: Rp. " +transaksi21.elementAt(j));
										System.out.println ("");
									}
								}
							}
							System.out.println ("");
							System.out.println ("========= Cetak Transaksi Pengiriman ==========");
							for (int i=0; i<transaksi1.size(); i++){
								System.out.println ("Kode Transaksi ke "			+(i+1)+"\t\t: "	+transaksi1.elementAt(i));
								System.out.println ("Tanggal Transaksi ke "			+(i+1)+"\t\t: "	+transaksi2.elementAt(i));
								System.out.println ("Kode Costumer ke "				+(i+1)+"\t\t: "	+transaksi3.elementAt(i));
								System.out.println ("Nama Costumer ke "				+(i+1)+"\t\t: "	+transaksi4.elementAt(i));
								System.out.println ("Alamat Costumer ke "			+(i+1)+"\t\t: "	+transaksi5.elementAt(i));
								System.out.println ("Telp/HP Costumer ke "			+(i+1)+"\t\t: "	+transaksi6.elementAt(i));
								System.out.println ("Email Costumer ke "			+(i+1)+"\t\t: "	+transaksi7.elementAt(i));
								System.out.println ("Kota Costumer ke "				+(i+1)+"\t\t: "	+transaksi8.elementAt(i));
								System.out.println ("Kode Barang  ke "				+(i+1)+"\t\t: "	+transaksi9.elementAt(i));
								System.out.println ("Kode Jenis Barang  ke "		+(i+1)+"\t\t: "	+transaksi10.elementAt(i));
								System.out.println ("Nama Jenis Barang  ke "		+(i+1)+"\t\t: "	+transaksi11.elementAt(i));
								System.out.println ("Nama Barang  ke "				+(i+1)+"\t\t: "	+transaksi12.elementAt(i));
								System.out.println ("Berat Barang  ke "				+(i+1)+"\t\t: "	+transaksi13.elementAt(i));
								System.out.println ("Total Harga Barang  ke "		+(i+1)+"\t: Rp."	+transaksi14.elementAt(i));
								System.out.println ("Diskon Barang ke "				+(i+1)+"\t\t: Rp."	+transaksi15.elementAt(i));
								System.out.println ("Total Harga Setelah Diskon ke "+(i+1)+"\t: Rp."	+transaksi16.elementAt(i));
								System.out.println ("Ongkos Kirim "					+(i+1)+"\t\t\t: Rp."+transaksi17.elementAt(i));
								System.out.println ("Status Pengiriman Barang  ke "	+(i+1)+"\t: "	+transaksi18.elementAt(i));
								System.out.println ("Nama Penerima Barang  ke "		+(i+1)+"\t: "	+transaksi19.elementAt(i));
								System.out.println ("Jumlah Pengiriman ke "			+(i+1)+"\t\t: "	+transaksi20.elementAt(i));
								System.out.println ("Jumlah Pembayaran ke "			+(i+1)+"\t\t: "	+transaksi21.elementAt(i));
							}	
						}
						else {
							System.out.print ("Terima Kasih");
						}
					break;
					case 6:
						System.out.println ("========= Cetak Data Jenis Barang =========");
						for (int i=0; i<barang1.size(); i++){
							System.out.println ("Kode Jenis Barang ke "	+(i+1) +"\t: " +barang1.elementAt(i));
							System.out.println ("Jenis Barang ke "		+(i+1) +"\t: " +barang2.elementAt(i));
						}
						System.out.println ("");
						System.out.println ("========= Cetak Data Master =========");
						for (int i=0; i<master1.size(); i++){
							System.out.println ("Kode Barang ke "		+(i+1) +"\t: " +master1.elementAt(i));
							System.out.println ("Kode Jenis Barang ke "	+(i+1) +"\t: " +master2.elementAt(i));
							System.out.println ("Nama Jenis Barang ke "	+(i+1) +"\t: " +master3.elementAt(i));
							System.out.println ("Nama Barang ke "		+(i+1) +"\t: " +master4.elementAt(i));
							System.out.println ("Berat Barang (gr) ke "	+(i+1) +"\t: " +master5.elementAt(i));
							System.out.println ("Harga Barang ke "		+(i+1) +"\t: Rp. " +master6.elementAt(i));
							System.out.println ("Diskon Barang ke "		+(i+1) +"\t: " +master7.elementAt(i) +"%");
						}
						System.out.println ("");
						System.out.println ("========== Cetak Costumer ==========");
						for (int i=0; i<customer1.size(); i++){
							System.out.println ("Kode Customer ke "		+(i+1) +"\t: " +customer1.elementAt(i));
							System.out.println ("Nama Customer ke "		+(i+1) +"\t: " +customer2.elementAt(i));
							System.out.println ("Alamat Customer ke "	+(i+1) +"\t: " +customer3.elementAt(i));
							System.out.println ("Telp/HP Customer ke "	+(i+1) +"\t: " +customer4.elementAt(i));
							System.out.println ("Email Customer ke "	+(i+1) +"\t: " +customer5.elementAt(i));
							System.out.println ("Kota Costumer ke "		+(i+1) +"\t: " +customer6.elementAt(i));
						}
						System.out.println ("");
						System.out.println ("========= Cetak Kota Tujuan ==========");
						for (int i=0; i<kota1.size(); i++){
							System.out.println ("Kode Kota ke "			+(i+1) +"\t\t: "	+kota1.elementAt(i));
							System.out.println ("Kota Tujuan ke "		+(i+1) +"\t: "		+kota2.elementAt(i));
							System.out.println ("Ongkos Kirim ke "		+(i+1) +"\t: Rp. "	+kota3.elementAt(i));
						}
						System.out.println ("");
						System.out.println ("========= Cetak Transaksi Pengiriman ==========");
						for (int i=0; i<transaksi1.size(); i++){
							System.out.println ("Kode Transaksi ke "			+(i+1)+"\t\t: "	+transaksi1.elementAt(i));
							System.out.println ("Tanggal Transaksi ke "			+(i+1)+"\t\t: "	+transaksi2.elementAt(i));
							System.out.println ("Kode Costumer ke "				+(i+1)+"\t\t: "	+transaksi3.elementAt(i));
							System.out.println ("Nama Costumer ke "				+(i+1)+"\t\t: "	+transaksi4.elementAt(i));
							System.out.println ("Alamat Costumer ke "			+(i+1)+"\t\t: "	+transaksi5.elementAt(i));
							System.out.println ("Telp/HP Costumer ke "			+(i+1)+"\t\t: "	+transaksi6.elementAt(i));
							System.out.println ("Email Costumer ke "			+(i+1)+"\t\t: "	+transaksi7.elementAt(i));
							System.out.println ("Kota Costumer ke "				+(i+1)+"\t\t: "	+transaksi8.elementAt(i));
							System.out.println ("Kode Barang  ke "				+(i+1)+"\t\t: "	+transaksi9.elementAt(i));
							System.out.println ("Kode Jenis Barang  ke "		+(i+1)+"\t\t: "	+transaksi10.elementAt(i));
							System.out.println ("Nama Jenis Barang  ke "		+(i+1)+"\t\t: "	+transaksi11.elementAt(i));
							System.out.println ("Nama Barang  ke "				+(i+1)+"\t\t: "	+transaksi12.elementAt(i));
							System.out.println ("Berat Barang  ke "				+(i+1)+"\t\t: "	+transaksi13.elementAt(i));
							System.out.println ("Total Harga Barang  ke "		+(i+1)+"\t: Rp."	+transaksi14.elementAt(i));
							System.out.println ("Diskon Barang ke "				+(i+1)+"\t\t: Rp."	+transaksi15.elementAt(i));
							System.out.println ("Total Harga Setelah Diskon ke "+(i+1)+"\t: Rp."	+transaksi16.elementAt(i));
							System.out.println ("Ongkos Kirim "					+(i+1)+"\t\t\t: Rp."+transaksi17.elementAt(i));
							System.out.println ("Status Pengiriman Barang  ke "	+(i+1)+"\t: "	+transaksi18.elementAt(i));
							System.out.println ("Nama Penerima Barang  ke "		+(i+1)+"\t: "	+transaksi19.elementAt(i));
							System.out.println ("Jumlah Pengiriman ke "			+(i+1)+"\t\t: "	+transaksi20.elementAt(i));
							System.out.println ("Jumlah Pembayaran ke "			+(i+1)+"\t\t: "	+transaksi21.elementAt(i));
							System.out.println ("");
						}
					break;
					case 7:
						System.out.print ("Masukkan Tanggal Transkaksi : ");
						tanggal = input.readLine();
						for (int i=0 ;i<transaksi1.size(); i++) {
							if (transaksi2.elementAt(i).equals (tanggal)){
								System.out.println("============================================");
								System.out.println ("Kode Costumer ke "				+(i+1)+"\t\t: "	+transaksi3.elementAt(i));
								System.out.println ("Nama Costumer ke "				+(i+1)+"\t\t: "	+transaksi4.elementAt(i));
								System.out.println ("Alamat Costumer ke "			+(i+1)+"\t\t: "	+transaksi5.elementAt(i));
								System.out.println ("Telp/HP Costumer ke "			+(i+1)+"\t\t: "	+transaksi6.elementAt(i));
								System.out.println ("Email Costumer ke "			+(i+1)+"\t\t: "	+transaksi7.elementAt(i));
								System.out.println ("Kota Costumer ke "				+(i+1)+"\t\t: "	+transaksi8.elementAt(i));
								System.out.println ("Kode Barang  ke "				+(i+1)+"\t\t: "	+transaksi9.elementAt(i));
								System.out.println ("Kode Jenis Barang  ke "		+(i+1)+"\t\t: "	+transaksi10.elementAt(i));
								System.out.println ("Nama Jenis Barang  ke "		+(i+1)+"\t\t: "	+transaksi11.elementAt(i));
								System.out.println ("Nama Barang  ke "				+(i+1)+"\t\t: "	+transaksi12.elementAt(i));
								System.out.println ("Berat Barang  ke "				+(i+1)+"\t\t: "	+transaksi13.elementAt(i));
								System.out.println ("Total Harga Barang  ke "		+(i+1)+"\t: "	+transaksi14.elementAt(i));
								System.out.println ("Diskon Barang ke "				+(i+1)+"\t\t: "	+transaksi15.elementAt(i));
								System.out.println ("Total Harga Setelah Diskon ke "+(i+1)+"\t: "	+transaksi16.elementAt(i));
								System.out.println ("Ongkos Kirim "					+(i+1)+"\t\t\t: "+transaksi17.elementAt(i));
								System.out.println ("Status Pengiriman Barang  ke "	+(i+1)+"\t: "	+transaksi18.elementAt(i));
								System.out.println ("Nama Penerima Barang  ke "		+(i+1)+"\t: "	+transaksi19.elementAt(i));
								System.out.println ("Jumlah Pengiriman ke "			+(i+1)+"\t\t: "	+transaksi20.elementAt(i));
								System.out.println ("Jumlah Pembayaran ke "			+(i+1)+"\t\t: "	+transaksi21.elementAt(i));
								System.out.println("============================================");
							}
						}
					break;
					case 8:
						System.exit(0);
					break;
				} 
			}while (true);
		}
	}