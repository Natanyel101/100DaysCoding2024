package isc;
import java.util.*;
public class day52 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan angka yang lebih besar dari nol: ");
        int a=oke.nextInt();
        String b=a>=0? ("positif"):("negatif");
        System.out.println (a+" adalah angka: "+b);
    }
    
}
