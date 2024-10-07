package isc;
import java.util.*;
public class soal3 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in); 
        System.out.print("masukkan jumlah apel: ");
        int zee= oke.nextInt();
        System.out.print("masukkan jumlah teman; ");
        int sip =oke.nextInt();
        int ok=zee%sip;
        System.out.println("ali memiliki: "+zee+" apel\ndan membaginya dengan rata kepada: "+sip+" temannya\nmaka sisa apel yang akan\ndi makan ali adalah:"+ok+"buah apel");
    }
    
}
