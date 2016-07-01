import java.util.Vector;
import java.io.*;

	public class demo {
		public static void main (String [] agrs) throws Exception {
			BufferedReader input = new BufferedReader ( new InputStreamReader (System.in));
			
			//deklarasi
			int N = 0;
			String jenis;
			//case1
			Vector barang1 = new Vector ();
			Vector barang2 = new Vector ();
			//case2
			Vector master1 = new Vector ();
			Vector master2 = new Vector ();
			Vector master3 = new Vector ();
			Vector master4 = new Vector ();
			
			do {
				System.out.println ("");
				System.out.println ("=======================================");
				System.out.println ("	    Selamat Datang");
				System.out.println ("        Di Toko Stikom Surabaya");
				System.out.println ("=======================================");
				System.out.println ("1. Data Jenis Barang");
				System.out.println ("2. Data Master");
				System.out.println ("3. Cetak Berdasarkan Jenis");
				System.out.println ("4. Exit");
				System.out.print ("Masukkan Pilihan Menu Anda\t: ");
				int pilih = Integer.parseInt(input.readLine ());
				System.out.println ("");
				switch (pilih) {
				case 1:
					System.out.println ("========== Data Jenis Barang ==========");
					System.out.print ("Masukan Jumlah Barang\t\t: ");
					N = Integer.parseInt (input.readLine());
						
					for (int i=0 ;i<N; i++) {
						System.out.print ("Masukkan Kode Jenis Barang ke " +(i+1)+"\t: ");
						barang1.addElement (input.readLine());
						System.out.print ("Masukkan Jenis Barang ke " +(i+1)+"\t: ");
						barang2.addElement (input.readLine());
					}
				break;
				case 2:
					System.out.println ("========== Data Master Barang ==========");
						System.out.print ("Masukan Jumlah Data Barang \t: ");
						N = Integer.parseInt (input.readLine());
						
						String namajenisbrg = "kosong";
						String master3input = "kosong";
						double diskon = 0;
						
						for (int i=0 ;i<N; i++) {
							System.out.print ("Masukkan Kode Barang ke " +(i+1)+"\t: ");
							master1.addElement (input.readLine ());
							System.out.print ("Masukkan Nama Barang ke " +(i+1)+"\t: ");
							master2.addElement (input.readLine ());
							
							System.out.print ("Masukkan Kode Jenis Barang ke " +(i+1)+"\t: ");
							master3input = input.readLine ();
								for(int j = 0; j<barang1.size(); j++){	
									if ((barang1.elementAt(j)).equals (master3input)){
										namajenisbrg = String.valueOf (barang2.elementAt(j));
									}
								}	
							master3.addElement (master3input);
							master4.addElement (namajenisbrg);
							System.out.println ("Nama Jenis Barang\t\t: "+master4.elementAt(i));
						}
				break;
				case 3:
					System.out.print ("Masukkan Jenis Barang : ");
						jenis = input.readLine();
						for (int i=0 ;i<master1.size(); i++) {
							if (master3.elementAt(i).equals (jenis)){
									System.out.println("============================================");
									System.out.println ("Kode Jenis Barang ke "		+(i+1)+"\t\t: "	+master1.elementAt(i));
									System.out.println ("Nama Nama Barang ke "		+(i+1)+"\t\t: "	+master2.elementAt(i));
									System.out.println ("Kode Jenis  ke "			+(i+1)+"\t\t: "	+master3.elementAt(i));
									System.out.println ("Nama Jenis"				+(i+1)+"\t\t\t: "	+master4.elementAt(i));
									System.out.println("============================================");
							}
						}
				break;
				case 4:
					System.exit(0);
				break;
				}
			}while(true);
				
		}
	}