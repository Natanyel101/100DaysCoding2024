package isc;
import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner zee= new Scanner(System.in);
        System.out.println("Masukkan angka desimal yang akan dibulatkan!!");
        System.out.print("masukkan $ ");
        double oke= zee.nextDouble();
        System.out.println("dibulatkan ke atas: "+ Math.ceil(oke));
        System.out.println("dibulatkan ke bawah: "+ Math.floor(oke));
        System.out.println("di bulatkan ke salah satunya: "+ Math.round(oke));
    }
}
