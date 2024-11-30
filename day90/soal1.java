import java.util.*;
public class soal1{
    public static void main (String[]args){
        Scanner oke=new Scanner (System.in);
        System.out.print("umur:");
        int a=oke.nextInt();
        if (a>=1 && a<=5){
            System.out.println("balita");
        }else if (a>=6 && a<=12){
            System.out.println("anak anak");
        }else if (a>=13 && a<=17){
            System.out.println("remaja");
        }else if (a>17){
            System.out.println("dewasa");
        }
    }
}
