package isc;
import java.util.Scanner;

public class day74 {

    public static void main(String[] args) {
        Scanner zee = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = zee.nextLine();
        int panjang = 0;
        for (int a = 0; a < teks.length(); a++) {
            panjang++;
        }
        System.out.println("Panjang teks dari \"" + teks + "\" yaitu: " + panjang);
        zee.close();
    }
}
