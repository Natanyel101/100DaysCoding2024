package isc;
import java.util.*;
public class day46 {
    
    public static void main(String[] args) {
        Scanner oke = new Scanner (System.in);
        System.out.print("masukkan angka: ");
        int a=oke.nextInt();
        System.out.print("masukkan angka lagi: ");
        int b=oke.nextInt();
        boolean c =a>b ;
        System.out.println("hasil : "+!c);
    }
    
}
