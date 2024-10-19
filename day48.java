package isc;
import java.util.*;
public class day48 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan password: ");
        String a=oke.nextLine();
        
        if (a.equalsIgnoreCase("natanyel")){
            System.out.println("nama: NATANYEL");
            System.out.println("umur: 17thn");
            System.out.println("status: mahasiswa");
            System.out.println("hoby: ngidol JKT48");
            System.out.println("oshi: marshajkt48");
      }
        else{
            System.out.println("password invailid");
        }
    }
}    
