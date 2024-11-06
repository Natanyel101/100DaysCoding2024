package isc;
import java.util.*;
public class day66 {
    
    public static void main(String[] args) {
        Scanner oke=new Scanner(System.in);
        System.out.println("masukkan ( persegi ) untuk persegi");
        System.out.println("masukkan ( persegi panjang ) untuk persegi panjang");
        System.out.println("masukkan ( keduanya ) untuk keduanya");
        System.out.print("masukkan angka 1/2: ");
        String a=oke.nextLine();
        System.out.println();
        if (a.equals("persegi")){
            for (int z=1; z<=5; z++){
                for(int e=1; e<=5; e++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
        else if(a.equals("persegi panjang")){
            for (int ze=1; ze<=5; ze++){
                for(int ez=1; ez<=10; ez++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
        else if(a.equals("keduanya")){
            System.out.println("PERSEGI");
            for (int z=1; z<=5; z++){
                for(int e=1; e<=5; e++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        System.out.println("---------------------");
        System.out.println("PERSEGI PANJANG");
            for (int ze=1; ze<=5; ze++){
                for(int ez=1; ez<=10; ez++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
    
}
