import java.io.*;

public class tugas1 {
	
	public static int pangkat(int x, int y) {
      if (y == 0) {
         return 1;
      }
      else {
         return x * pangkat(x, y - 1);
      }
   }
	
	public static void garis(){
		System.out.println("======================================");
	}
	
	private static int fibo(int n)	{
		int f;
		if(n==1 || n==2)
			f=1;
		else
			f = fibo(n-1) + fibo(n-2);
		return f;
	}
	
	public static void main (String [] args) throws Exception {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
			garis ();
			System.out.print("Masukkan Angka         : ");
			int x = Integer.parseInt(input.readLine());
			System.out.print("Masukkan Nilai Pangkat : ");
			int y =Integer.parseInt(input.readLine());
			garis ();
			System.out.println("Hasil Perpangkatan   : "+pangkat(x,y));
			System.out.print("Hasil Fibonaci       : ");
			for(int i=1;i<=x;i++)
				System.out.print(fibo(i) + " ");
				System.out.println();
			garis ();
	}
	
}