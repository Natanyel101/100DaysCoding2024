package isc;
import java.util.*;
public class day70 {
    
    public void zee(int angka) {
        System.out.println("Angka: " + angka);
    }
    public static void main(String[] args) {
        Scanner ok=new Scanner (System.in);
        day70 oke = new day70();
        System.out.print("masukkan angka (satu / dua): ");
        String a=ok.nextLine();
        switch (a){
            case "satu":
        oke.zee(1);
            break;
            case "dua":
        oke.zee(2);
            break;
            
            default:
            System.out.println("invailid");
            break;
        }
    }
}
