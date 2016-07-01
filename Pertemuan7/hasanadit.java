//Nama: Mohammad Hasan Bisri
//NIM : 14410100091
//Nama: Aditya Anugrah Pratama
//NIM : 14410100112

import java.io.*;

public class hasanadit{
	public static void main (String[]arg)throws Exception{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Masukkan jumlah bunga yang akan di jual : ");
		int N = Integer.parseInt(br.readLine());
		String [][] kode = new String [N][3];
		int [][] data = new int [N][3];
		//Input Nilai Elemen Array 2D = For
		System.out.println("=========================================");
		
		for (int i=0; i<N; i++){
		System.out.print("Masukkan kode bunga ke " + (i+1) +" : ");
		kode[i][0]= br.readLine();
		System.out.print("Masukkan nama bunga ke " + (i+1) +" : ");
		kode[i][1]= br.readLine();
		System.out.print("Masukkan Warna bunga ke " + (i+1) +" : ");
		kode[i][2]= br.readLine();
		}

		for (int i=0; i<N; i++){
		System.out.print("Masukkan harga per batang ke " + (i+1) +" : ");
		data[i][0]= Integer.parseInt(br.readLine());
		System.out.print("Masukkan jumlah jual ke " + (i+1) + " : ");
		data[i][1]= Integer.parseInt(br.readLine());
		}

		for (int i=0; i<N; i++){
		System.out.println("=========================================");
		System.out.println("Nama kode bunga ke " + (i+1) + " = " + kode[i][0]);
		System.out.println("Nama nama bunga ke " + (i+1) + " = " + kode[i][1]);
		System.out.println("Nama warna bunga ke " + (i+1) + " = " + kode[i][2]);
		System.out.println("Harga bunga ke " + (i+1) + " = " + data[i][0]);
		System.out.println("Jumlah beli per batang ke " + (i+1) + " = " + data[i][1]);
		}

		System.out.println("=========================================");
		
		for (int i=0; i<N; i++){
		data[i][2] = (data[i][0] * data [i][1]);
		System.out.println("Total harga per bunga ke " + (i+1) + " :  " + data[i][2]);
		}

		int total = 0;
		for (int i=0; i<N; i++){
		total = total + data[i][2];
		}
		System.out.println("Nilai Total Penjualan : " +total);

	}
}