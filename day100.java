package isc;
import java.time.LocalTime;
import java.util.*;

public class day100 {
    public static void main(String[] args) {
        Scanner oke = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = oke.nextLine();
        LocalTime sekarang = LocalTime.now();
        String salam;
        double jam = sekarang.getHour(); // Mendapatkan jam dalam bentuk angka (0-23)
        if (jam > 6.00 && jam < 12.00) {
            salam = "Selamat pagi";
        } else if (jam > 12.00 && jam < 17.00) {
            salam = "Selamat siang";
        } else {
            salam = "Selamat malam";
        }
        String garis = "══════════════════════════════════════════";
        System.out.println(garis);
        System.out.println("   |   " + salam + ", " + nama);
        System.out.println("   |   Program Anda Telah Selesai");
        System.out.println(garis);
    }
}
