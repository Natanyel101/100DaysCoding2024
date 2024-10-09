package isc;
import java.util.*;
public class soal2 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan stok beras: ");
        int zee=oke.nextInt();
        System.out.print("jumlah bagian untuk di jual: ");
        int sip=oke.nextInt();
        zee /=sip;
        System.out.println("stok yang ada pada setiap bagian: "+zee);
    }
    
}
