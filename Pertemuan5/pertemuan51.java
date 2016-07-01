import java.io.*;

	public class pertemuan51 {
		public static void main (String[]args) throws Exception{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Masukan Jumlah Mahasiswa = ");
				int N = Integer.parseInt (input.readLine());
				
				String [] nama = new String [N];
				int [] nilai = new int [N];
				int [] tugas = new int [N];
				int [] nAkhir = new int [N];
				
					for (int i=0 ;i < N; i++) {
						System.out.print ("Masukan nama Mahasiswa ke " +(i+1) + ":");
						nama [i] = input.readLine ();
						System.out.print ("Masukan nilai Mahasiswa ke "+(i+1) + ": ");
						nilai [i] = Integer.parseInt (input.readLine());
						System.out.print ("Masukan tugas Mahasiswa ke " +(i+1) + ": ");
						tugas [i] = Integer.parseInt (input.readLine());
					}
					
					for (int i=0; i < N; i++) {
						nAkhir [i] = (nilai [i] + tugas [i])/2;
					}
					
					for (int i=0; i<N; i++) {
						System.out.println ();
						System.out.println ("Nama Mhs ke= " +nama[i]);
						System.out.println ("Nilai Mhs ke= " +nilai[i]);
						System.out.println ("Tugas Mhs ke= " +tugas[i]);
						System.out.println ("nAkhir Mhs ke= " +nAkhir[i]);
					}
					
					int max = nAkhir[0];
					for (int i=1; i<N; i++) {
						if (nAkhir [i] > max){
							max = nAkhir [i];
						}
					}
					System.out.println ("Nilai Akhir Terbesar = " +max);
					
					int total=0;
					for (int i=0; i < N; i++){
						total=total +nAkhir [i];
					}
					int rata=total/N;
					System.out.println ("Nilai Rata - Rata = " +rata);
	}
}