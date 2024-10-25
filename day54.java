package isc;
import java.util.*;
public class day54 {
    
    public static void main(String[] args) {
        Scanner oke =new Scanner (System.in);
        System.out.print("masukkan dari mana angka di mulai: ");
        int b=oke.nextInt();
        System.out.print("masukkan dimana angka berakhir: ");
        int c=oke.nextInt();
        for (int a=b; a<=c; a+=3)
        System.out.println("ini angka: "+a);
        System.out.println("dimulai dari angka: "+b);
        System.out.println("berakhir di angka: "+c);
    }
    
}
