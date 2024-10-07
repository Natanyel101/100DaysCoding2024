package isc;
import java.util.*;
public class soal2 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan jumlah permen: ");
        int zee=oke.nextInt();
        System.out.print("masukkan jumlah siswa: ");
        int sip=oke.nextInt();
        System.out.println("apabila guru mempunyai "+zee+" permen\nuntuk setiap "+sip+" murid \nmaka setiap murid mendapatkan masing-masing:"+(zee/sip)+"permen");
    }
    
}
