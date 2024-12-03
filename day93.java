package isc;
import java.util.*;
public class day93 {
        public static void main(String[] args) {
        Scanner zee = new Scanner(System.in);
        System.out.print("masukan tinggi pola: ");
        int oke= zee.nextInt();
            
            for (int a = 1; a <= oke; a++) {
                for (int b= oke; b >= 1; b--) {
                if (b== a) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int c= 2; c<= oke; c++) {
                if (c== a) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
