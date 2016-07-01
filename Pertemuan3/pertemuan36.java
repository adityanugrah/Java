import java.io.*;

	public class pertemuan36 {
		public static void main (String[]args) throws Exception{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.println ("Pilihan Menu Makanan : ");
				System.out.println ("1. Menu Nasi Campur ");
				System.out.println ("2. Menu Nasi Pecel ");
				System.out.println ("3. Menu Nasi Goreng ");
				System.out.println ("4. Keluar/Selesai ");
				System.out.print ("Masukan Pilihan Menu Anda : ");
				int pilih = Integer.parseInt(input.readLine ());
				switch (pilih){
					case 1:
						System.out.println ("Anda memilih Nasi Campur...");
					break;
					case 2:
						System.out.println ("Anda memilih Nasi Pecel...");
					break;
					case 3:
						System.out.println ("Anda memilih Nasi Goreng...");
					break;
					case 4:
						System.exit(0);
					break;
					default:
						System.out.println ("Pilihan Menu hanya ada 1 - 4");
				}
		}
				
	}