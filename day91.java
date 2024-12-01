package isc;
import java.util.*;
public class day91 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        for (;;){
            System.out.print("masukkan angka: ");
            int a=oke.nextInt();
            if(a==0){
                System.out.println("nol");
            }
            else if (a%2==0){
                System.out.println("genap");
            }
            else{
                System.out.println("you and I, and");
                break;
            }
        }
    }
    
}
