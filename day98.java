package isc;
import java.util.*;
public class day98 {
    public static void main(String[] args) {
        Scanner oke = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int zee = oke.nextInt();
        System.out.print("Masukkan nilai y: ");
        int sip = oke.nextInt();
        int a = 0;
        for (int b = zee; b <= sip; b++) {
            if (b % 2 == 0) {
                a += b;
            }
        }
        System.out.printf("Total penjumlahan bilangan genap dari %d ke %d adalah: %d%n", zee, sip, a);
    }
}
