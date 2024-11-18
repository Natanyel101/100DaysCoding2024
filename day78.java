package isc;
import java.util.*;
public class day78 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan username: ");
        String ok=oke.nextLine();
        System.out.print("password: ");
        String sip=oke.nextLine();
        System.out.println("masuk untuk login!!!");
        System.out.print("masukkan username: ");
        String zee=oke.nextLine();
        System.out.print("masukkan password: ");
        String ze=oke.nextLine();
        
        if(zee.equalsIgnoreCase(ok) && ze.equalsIgnoreCase(sip)){
            System.out.println("BERHASIL LOGIN");
        }
        else {
            System.out.println("INVAILID");
        }
    }
    
}
