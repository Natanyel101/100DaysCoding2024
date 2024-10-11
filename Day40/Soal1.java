package isc;
import java.util.*;
public class soal1 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("jumlah nilai ujian pertama: ");
        int zee=oke.nextInt();
        System.out.print("jumlah nilai ujian kedua: ");
        int sip=oke.nextInt();
        int selisih =zee-=sip;
        System.out.println("jadi selisih dari nilai pertama "+zee+" dan nilai kedua "+sip+" adalah "+selisih);
    }
    
}
