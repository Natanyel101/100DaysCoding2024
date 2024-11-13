package isc;
import java.util.*;

public class day73 {

    public static void main(String[] args) {
        Scanner zee = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int oke = zee.nextInt();
        
        System.out.print("Masukkan operator (+ atau -): ");
        char ok = zee.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        int sip = zee.nextInt();

        int hasil = 0;
        
        if (ok == '+') {
            hasil = oke + sip;
        } else if (ok == '-') {
            hasil = oke - sip;
        } else {
            System.out.println("Operator tidak valid.");
            zee.close();
            return;
        }
        System.out.println("Hasil: " + hasil);
        zee.close();
    }
}
