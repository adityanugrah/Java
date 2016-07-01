import java.util.Vector;
import java.io.*;

public class ibu {
	public static void main (String [] arg) throws Exception{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		Vector nim = new Vector ();
		
		System.out.println ("===============================================");
		//insert data
		System.out.print ("Masukkan jumla data mahasiswa : ");
		int N = Integer.parseInt (input.readLine());
		
		for (int i=0; i<N; i++) {
			System.out.print ("Masukkan NIM mhs ke " +(i+1) +" : ");
			nim.addElement (input.readLine());
		}
		
		//lihat data
		for (int i=0; i<N; i++) {
			System.out.println ( (i+1) +". " +"NIM mhs\t: " +nim.elementAt(i));
		}
		
		//hapus data
		System.out.print ("Masukkan NIM yg salah : ");
		String nimhapus1 = input.readLine();
		nim.removeElement (nimhapus1);
		
		
		//cetak lagi
		for (int i=0; i<nim.size(); i++) {
			System.out.println ( (i+1) +". " +"NIM mhs\t: " +nim.elementAt(i));
		}
		
		
		//update data
		
		
		
		System.out.print ("Masukkan NIM yg diupdate : ");
		String nimhapus = input.readLine();
		int index = nim.indexOf(nimhapus);
		nim.removeElement (nimhapus);

		System.out.print ("Masukkan NIM mhs :");
		nim.insertElementAt (input.readLine(),index);
			
			
			
		//sekali lagi cetak
		for (int i=0; i<nim.size(); i++) {
			System.out.println ( (i+1) +". " +"NIM mhs\t: " +nim.elementAt(i));
		}

		System.out.println ("===============================================");
	}
}


//jangan lupa kurung buka dan tutup