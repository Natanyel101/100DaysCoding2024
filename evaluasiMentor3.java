package isc;
import java.util.*;
public class evaluasiMentor3 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner(System.in);
        int a=oke.nextInt();
        for (int b=1; b<=a; b++){
            for (int c=1; c<=a; c++){
                if (c==b){
                System.out.print("1"+" ");
                }
                else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    
}
