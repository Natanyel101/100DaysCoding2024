package isc;
import java.util.*;
public class soal2 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan stok barang pertama: ");
        int zee=oke.nextInt();
        System.out.print("jumlah stok barang kedua: ");
        int ok=oke.nextInt();
        ok-=zee;
        System.out.println("selisih dari stok barang pertama dan kedua adalah "+ok);
    }
    
}
