package isc;
import java.util.*;
public class soal5 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner (System.in);
        int a=oke.nextInt();
        if (a==0){
            System.out.println("nol");
        }else if (a>0){
            System.out.println("positif");
        }else if(a<0){
            System.out.println("negatif");
        }
    }
    
}
