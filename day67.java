import java.util.*;
public class day67 {
    public  void plus(int a, int n) {
        int h = a + n;
        System.out.println("Hasil : " + h);
    }
        public void min(int a, int n){
            int ha= a - n;
            System.out.println("hasil : "+ha);
        }
    public void ok(){
        Scanner oke=new Scanner (System.in);
        System.out.print("masukkan angka pertama: ");
        int a=oke.nextInt();
        System.out.print("masukkan angka kedua: ");
        int n=oke.nextInt();
        System.out.println("masukkan operator");
        System.out.println("masukkan ( 1/+ )untuk penjumlahan");
        System.out.println("masukkan ( 2/- )untuk pengurangan");
        System.out.print("masukkan: ");
        String b=oke.next();
        
        if (b.equals("+")||b.equals("1")){
            plus(a,n);
        }
        else if(b.equals("-") || b.equals("2")){
           min(a, n);
        }
    }
    public static void main(String[] args) {
        day67 z=new day67();
        
        z.ok();
    }
    
}
