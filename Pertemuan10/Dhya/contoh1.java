import java.io.*;
public class contoh1{
		public static void garis(){
			System.out.println("=================");
		}
		public static void main (String [] args) throws IOException{
			BufferedReader inputan = new BufferedReader (new InputStreamReader(System.in));
			garis();
				System.out.println("Data Nilai Mahasiswa");
			garis();
				System.out.print("Nama Mahasiswa = ");
				String namaMhs = inputan.readLine();
				System.out.print("Masukkan nim mahasiswa = ");
				String nimMhs = inputan.readLine();
				System.out.print("Masukkan nilai ke-1 = ");
				double tgs1Mhs = Double.parseDouble(inputan.readLine());
				System.out.print("Masukkan nilai ke-2 = ");
				double tgs2Mhs = Double.parseDouble(inputan.readLine());
				System.out.print("Masukkan nilai ke-3 = ");
				double tgs3Mhs = Double.parseDouble(inputan.readLine());
				garis();
				dataNama(namaMhs,nimMhs);
				dataNilai(tgs1Mhs,tgs2Mhs,tgs3Mhs);
				garis();
		}
			public static void dataNama(String nama, String nim){
				System.out.println("Nama Mahasiswa \t= " + nama );
				System.out.println("Nim Mahasiswa \t= " + nim );
			}
			public static void dataNilai(double tugas1, double tugas2, double tugas3){
				System.out.println("nilai tugas1 \t= " + tugas1);
				System.out.println("nilai tugas2 \t= " + tugas2);
				System.out.println("nilai tugas3 \t= " + tugas3);
				System.out.println("nilai total \t= " + Math.round(total(tugas1,tugas2,tugas3)));
			}
			private static double total (double tugas1M, double tugas2M, double tugas3M){
				double totalnilai = tugas1M + tugas2M + tugas3M;
				return (totalnilai);
			}
}