import java.io.*;
public class coba1 {
	
	private static int diskon (int harga, int diskon){
		int total = harga - (harga*diskon/100);
		return (total);
	}
	
	public static void main (String[] args)throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Masukkan Harga \t\t: Rp.");
		int harga1 = Integer.parseInt(br.readLine());
		
		System.out.print("Masukkan diskon(%) \t: ");
		int diskon1 = Integer.parseInt(br.readLine());
		
		System.out.println("==================================");
		System.out.println("Hasil Diskon 		: Rp."+ diskon (harga1,diskon1));
		
	}
}
