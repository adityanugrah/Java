import java.util.*;
public class cobak {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x=3;
        System.out.println("Faktorial "+x);
        System.out.println("hasil : "+faktorial(x));
        System.out.println("---------------------------");
    }
    
    
   public static int faktorial(int x){
        if(x==0){
            return 1;
        }else{
            return x*faktorial(x-1);
        }
    }
}
