`//Nama : Mohammad Hasan Bisri
//NIM  : 14410100091
//Nama : Aditya Anugrah Pratama
//NIM  : 14410100112
//Ini ARRAY 2D

import java.io.* ;
	public class pertemuan7 {
		public static void main (String[]args) throws Exception {
			BufferedReader input = new BufferedReader ( new InputStreamReader (System.in));
			
			System.out.print ("Masukan jumlah bunga yang akan dijual : ");
			int N = Integer.parseInt (input.readLine());
			//deklarasi
			String [][] kode = new String [N][3];
			int [][] data= new int [N][3];
			
			//Input Nilai Elemen Array 2D = Nested For
			for (int i=0 ;i<N; i++) {
				for (int j=0; j<3;j++){
					System.out.print ("Masukan nilai elemen array ["+i+"]["+j+"] ");
					kode [i][j] = input.readLine ();
				}
			}
			
			for (int i=0 ;i<N; i++) {
				for (int j=0; j<2;j++){
					System.out.print ("Masukan nilai elemen array ["+i+"]["+j+"] ");
					data [i][j] = Integer.parseInt (input.readLine ());
				}
			}
		
			for (int i=0 ;i<N; i++) {
				for (int j=0; j<3;j++){
					data [i][2] = data [i][0]* data[i][1];
				}
			}
			
			int total = 0;
			for (int i=0 ;i<N; i++) {
					total = total + data [i][2];
			}
			System.out.println ("Total Jual :" +total);
			
		}
	}