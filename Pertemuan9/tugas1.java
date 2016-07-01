import java.io.*;
public class tugas1 {
	
	private static int kalkulator (int a, int b){
		return (a*b);
	}
	private static double kalkulator (double c, double d){
		return (c/d);
	}
	
	public static void main (String[] args)throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Masukkan Angka pertama\t: ");
		double a1 = Integer.parseInt(input.readLine());
					
		System.out.print("Masukkan Angka ke dua\t: ");
		double b1 = Integer.parseInt(input.readLine());
					
		System.out.println("==================================");
		System.out.println("Hasil Perkalian\t\t: " +kalkulator(a1,b1));		
		
	}
}
