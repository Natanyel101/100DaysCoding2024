package isc;
import java.util.*;
public class day34 {
    
    public static void main(String[] args) {
        Scanner jkt= new Scanner (System.in);
        System.out.print("Masukkkan gaji pokok: ");
        int zee= jkt.nextInt();
        System.out.print("Masukkan berapa jam lembur: ");
        int you= jkt.nextInt();
        int lembur= 10000;
        int ok= you*lembur;
        System.out.println(" |Hasil Gaji Bersih ="+(zee+ok));
    }
    
}
