import java.util.*;
import java.io.*;

public class tugas2 { 
    public static void main(String[] args) throws Exception { 
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Masukkan Jumlah Stack : ");
        int n = Integer.parseInt (input.readLine());
		
        Stack <String> stack1 = new Stack <String> ();
		
        for(int i = 0; i < n; i++){ 
            System.out.println ("Masukkan Warna ke " +(i+1) + " : ");
			//stack1 = input.readLine() ;
            stack1.push(input.readLine()); 
        }
        while (!(stack1.isEmpty())) { 
            System.out.println(stack1.pop()); 
        } 
    } 
} 