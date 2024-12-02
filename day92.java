package isc;
import java.util.*;
public class day92 {
    public static void main(String[] args) {
        Scanner oke = new Scanner(System.in);
        System.out.println("pola V");
        System.out.print("masukkan tinggi pola: ");
        int zee = oke.nextInt();
        for (int a = 0; a < zee; a++) {
            for (int b = 0; b < 2 * zee - 1; b++) {
                if (b == a || b == (2 * zee - 2) - a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
