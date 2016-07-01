import java.io.*;
public class fungsi {
	private static int penjumlahan (int bil1, int bil2) {
		return (bil1+bil2);
	}
	private static int pengurangan (int b1, int b2){
		return (b1-b2);
	}
	private static int diskon (int harga, int diskon){
		return (harga - (harga*diskon/100));
	}
	
	public static void main (String[] args)throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Masukkan bilangan ke 1 \t: ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("Masukkan bilangan ke 2 \t: ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.print("Masukkan Harga \t\t: Rp.");
		int harga1 = Integer.parseInt(br.readLine());
		
		System.out.print("Masukkan diskon(%) \t: ");
		int diskon1 = Integer.parseInt(br.readLine());
		
		System.out.println("==================================");
		System.out.println("Hasil Penjumlahan	: "+penjumlahan(a,b));
		System.out.println("Hasil Pengurangan	: "+pengurangan(a,b));
		System.out.println("Hasil Diskon 		: Rp."+diskon(harga1,diskon1));
		
	}
}