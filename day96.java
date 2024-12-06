package isc;

import java.util.Scanner;

public class day96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi pola diamond: ");
        int n = scanner.nextInt();
        int a =(n/2)+1;
        for (int i = 1; i <= a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a - 1; i >= 1; i--) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
