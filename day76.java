package isc;
import java.util.*;
public class day76 {
    public static void main(String[] args) {
        Scanner zee=new Scanner (System.in);
        System.out.print("masukkan dua kata: ");
        String oke =zee.nextLine();
        
        System.out.println("huruf kecil: "+oke);
        String ok= oke.toUpperCase();
        System.out.println("huruf besar: "+ok);
    }
}
