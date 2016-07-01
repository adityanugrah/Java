import java.io.*;
public class over {
	
	private static int kalkulator (int a, int b){
		return (a*b);
	}
	private static double kalkulator (double c, double d){
		return (c/d);
	}
	
	public static void main (String[] args)throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		do {
			System.out.println ("Kalkulator Sederhana");
			System.out.println ("1. Perkalian");
			System.out.println ("2. Pembagian");
			System.out.println ("3. Exit");
			System.out.print ("Masukkan Pilihan Menu Anda\t: ");
			int pilih = Integer.parseInt(input.readLine ());
			
			switch (pilih) {
				case 1:
					System.out.print("Masukkan Angka pertama\t: ");
					int a1 = Integer.parseInt(input.readLine());
					
					System.out.print("Masukkan Angka ke dua\t: ");
					int b1 = Integer.parseInt(input.readLine());
					
					System.out.println("==================================");
					System.out.println("Hasil Perkalian\t\t: " +kalkulator(a1,b1));
				break;
				case 2:
					System.out.print("Masukkan Angka pertama\t: ");
					double a2 = Integer.parseInt(input.readLine());
					
					System.out.print("Masukkan Angka ke dua\t: ");
					double b2 = Integer.parseInt(input.readLine());
					
					System.out.println("==================================");
					System.out.println("Hasil Pembagian\t\t: " +kalkulator(a2,b2));
				break;
				case 3:
					System.exit(0);
				break;
			}
		} while (true);
		
	}
}