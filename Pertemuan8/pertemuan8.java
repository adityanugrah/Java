import java.io.* ;

public class pertemuan8 {
	public static void garis () {
		System.out.println ("======================================");
	}
	public static void data (String nim, String nama, int usia) {
		System.out.println ("NIM  Mhs = " +nim);
		System.out.println ("Nama Mhs = " +nama);
		System.out.println ("Usia Mhs = " +usia + " tahun");
	}
	public static void main (String [] arg ) throws Exception {
		BufferedReader input = new BufferedReader ( new InputStreamReader (System.in));
			garis ();
			System.out.println ("DATA MAHASISWA");
			garis ();
			System.out.print ("Masukan Nim Mahaiswa  : ");
			String nimMhs = input.readLine ();
			System.out.print ("Masukan Nama Mahaiswa : ");
			String namaMhs = input.readLine ();
			System.out.print ("Masukan usia Mahaiswa : ");
			int usiaMhs = Integer.parseInt (input.readLine ());
			garis();
			data (nimMhs,namaMhs,usiaMhs);
			garis(); 
	}
}