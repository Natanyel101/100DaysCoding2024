package isc;
import java.util.*;
public class day77 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan email yang ingin di gunakan: ");
        String ok=oke.nextLine();
        System.out.print("password: ");
        String sip=oke.nextLine();
        System.out.println("masuk untuk login!!!");
        System.out.print("masukkan email: ");
        String zee=oke.nextLine();
        System.out.print("masukkan password: ");
        String ze=oke.nextLine();
        
        if(zee.equals(ok) && ze.equals(sip)){
            System.out.println("BERHASIL LOGIN");
        }
        else {
            System.out.println("INVAILID");
        }
    }
    
}
