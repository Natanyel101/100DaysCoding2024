package isc;
import java.util.*;
public class day42 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan angka pertama: ");
        int a=oke.nextInt(); 
        System.out.print("masukkan angka kedua: ");
        int b=oke.nextInt();
        System.out.println("hasil dari perbandingan sama dengan: "+(a==b));
        System.out.println("hasil dari perbandingan tidak sama dengan: "+(a!=b));
    }
    
}
