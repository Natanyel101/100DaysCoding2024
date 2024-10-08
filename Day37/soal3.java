package isc;
import java.util.*;
public class soal3 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in); 
        System.out.print("masukkan jumlah barang: ");
        int zee= oke.nextInt();
        System.out.print("jumlah barang yang di jual; ");
        int sip =oke.nextInt();
        System.out.println("sebuah toko memiliki "+zee+" barang\nsetiap minggu mereka menjual "+sip+" barang\nsisa barang di gudang setelah satu minggu adalah:"+(zee-=sip));
    }
    
}
