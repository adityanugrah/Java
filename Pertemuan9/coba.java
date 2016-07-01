import java.io.*;
public class coba {
	public static int penjumlahan (int bil1, int bil2) {
		int hasil = bil1+ bil2;
		return (hasil);
	}
	private static int pengurangan (int b1, int b2){
		return (b1-b2);
	}
	
	public static void main (String[] args)throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Masukkan bilangan ke 1 \t: ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("Masukkan bilangan ke 2 \t: ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("==================================");
		System.out.println("Hasil Penjumlahan	: "+penjumlahan(a,b));
		System.out.println("Hasil Pengurangan	: "+pengurangan(a,b));
		
	}
}
