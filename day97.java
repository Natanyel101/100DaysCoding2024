package isc;
import java.util.*;
public class day97 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan angka:");
        int a=oke.nextInt();
        for (int b=2; b<=a; b++){
            boolean c=true;
            for (int d=2; d<b; d++){
                if (b %2 ==0){
                    c = false;
                    break;
                }
            }
            if (c){
                System.out.print(" "+b);
            }
        }
    }
    
}
