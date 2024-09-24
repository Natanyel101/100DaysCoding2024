package isc;

public class day23 {
    
    public static void main(String[] args) {
        //tipe data reference Long  
        long no=133334L;
        Long na= Long.valueOf(133334L);
        //variable constanta
        //minimal tipe data Long Mencakup -9,2 quadriliun
        //maximal tipe data Long Mencakup  9,2 quadriliun
        Long min=Long.MIN_VALUE;
        Long max=Long.MAX_VALUE;
        //print
        System.out.println("hasil konversi object: "+na);
        System.out.println("ini adalah MIN Long: "+min);
        System.out.printf("ini adalah MAX Long: %d \n",max);
    }
    
}
