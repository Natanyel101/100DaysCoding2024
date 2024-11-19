package isc;

import java.util.Arrays;
import java.util.Scanner;

public class day79{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah teman: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] friends = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama teman ke-" + (i + 1) + ": ");
            friends[i] = scanner.nextLine();
        }
        System.out.println("\nNama teman saya: " + Arrays.toString(friends));
        System.out.println("Nama teman saya satu per satu:");
        for (int i = 0; i < friends.length; i++) {
            System.out.println("- " + friends[i]);
        }

        scanner.close();
    }
}
