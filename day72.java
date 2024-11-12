package isc;
public class day72 {
    public int oke(int n) {
        if (n <= 1) {  
            return n;
        } else {
            return n + oke(n - 1);
        }
    }

    public static void main(String[] args) {
        day72 zee = new day72();
        int hasil =zee.oke(10);
        System.out.println("hasil penjumlahan 10-1 : " + hasil);
    }
}
