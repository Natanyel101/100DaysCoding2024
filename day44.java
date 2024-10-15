package isc;
import java.util.*;
public class day44 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        
        if (angka1 > 0 && angka1 < 10) {
            System.out.println("anak anak");
        } 
        else if (angka1 >10 && angka1 < 17){
            System.out.println("remaja");
        }
        else{
            System.out.println("dewasa");
        }
        
    }
    
}
