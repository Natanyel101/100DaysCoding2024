package isc;

import java.math.*;

public class day29 {
    
    public static void main(String[] args) {
        BigInteger a = new BigInteger("123456789012367890");
        BigInteger b = new BigInteger("9876543212288828282");

        // Penjumlahan
        BigInteger c= a.add(b);
        System.out.println("Penjumlahan: " + c);

        // Pengurangan
        BigInteger d = a.subtract(b);
        System.out.println("Pengurangan: " + d);

        // Perkalian
        BigInteger e= a.multiply(b);
        System.out.println("Perkalian: " + e);

        // Pembagian
        BigInteger f = b.divide(a);
        System.out.println("Pembagian: " + f);
        
        //sisa bagi
        BigInteger g =a.mod(b);
        System.out.println("sisa bagi: " + g);
    }
}
