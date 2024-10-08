package isc;
import java.util.*;
public class soal2 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan jumlah awal pohon : ");
        int zee=oke.nextInt();
        System.out.print("jumlah penambahan pohon setiap bulan: ");
        int sip=oke.nextInt();
        System.out.println("awalnya ada:"+zee+"pohon\nsetiap bulan tukang kebun selalu menambah "+sip+"pohon baru,\nmaka setelah satu bulan,tukang kebun memiliki"+(zee+sip)+"pohon");
    }
    
}
