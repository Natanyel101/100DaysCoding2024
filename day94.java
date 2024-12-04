package isc;
import java.util.*;
public class day94 {

    public static void main(String[] args) {
        Scanner oke= new Scanner(System.in);
        System.out.print("Masukkan tinggi segi tiga: ");
        int zee= oke.nextInt();
        for (int a= zee; a>= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = a; c <= zee; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
