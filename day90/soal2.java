package isc;
import java.util.*;
public class soal2 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan bilangan bulat:");
        int a=oke.nextInt();
        System.out.print("masukkan bilangan bulat:");
        int b =oke.nextInt();
        if (a%2==0 && b%2==0){
            System.out.println("kedua bilangan adalah genap");
        }else if (a%2==1 && b%2==1){
            System.out.println("kedua bilangan adalah ganjil");
        }else {
            System.out.println("satu bilangan genap dan satu bilangan ganjil");
        }
        }
    
}
