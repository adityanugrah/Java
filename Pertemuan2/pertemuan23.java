public class pertemuan23 {
	public static void main (String[]arg){
		String jari = "10";
		String konsPhi = "3.14";
		int konversiJari = Integer.parseInt (jari);
		double konversiPhi = Double.parseDouble (konsPhi);
		double luas = konversiPhi * konversiJari * konversiJari;
		System.out.println ("Luas Lingkaran = " +luas);
	}
}