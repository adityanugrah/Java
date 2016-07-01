import java.util.*;
public class cobak {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("masukan  bilangan = ");
		int x=Integer.parseInt(input.nextLine());
		System.out.print("masukan  bilangan  perpangkatan = ");
		int y=Integer.parseInt(input.nextLine());
		System.out.println("---------------------------");
        System.out.println("hasil Faktorial: "+faktorial(x));
		System.out.println("hasil perpangkatan: "+pangkatRekursif(x,y));
        System.out.println("---------------------------");
    }
	
	public static int pangkatRekursif(int g, int h) {
      if (h == 0) {
         return 1;
      }
      else {
         return g * pangkatRekursif(g, h-1);
      }
   }
    
    
   public static int faktorial(int x){
        if(x==0){
            return 1;
        }else{
            return x*faktorial(x-1);
        }
    }
}
