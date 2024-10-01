package isc;
import java.math.*;
public class day30 {
    
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("15.69");
        BigDecimal b = new BigDecimal("9.52");

        // Penjumlahan
        BigDecimal c = a.add(b);
        System.out.println("Penjumlahan: " + c);

        // Pengurangan
        BigDecimal d = a.subtract(b);
        System.out.println("Pengurangan: " + d);

        // Perkalian
        BigDecimal e= a.multiply(b);
        System.out.println("Perkalian: " + e);
        
    }
    
}
