package isc;
import java.util.*;
public class day95 {

    public static void main(String[] args) {
        Scanner oke= new Scanner(System.in);
        System.out.print("masukkan tinggi:");
        int a= oke.nextInt();
        int d=a*2;
            for (int c=0; c<d; c++){
            System.out.print("_");
            }
            System.out.println();
            for (int b=0; b<a; b++) {
            for (int e=0; e<b; e++) {
                System.out.print(" ");
            }
            for (int f=a; f>b; f--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
