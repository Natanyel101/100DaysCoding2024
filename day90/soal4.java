package isc;

public class soal4 {
    
    public static void main(String[] args) {
        for (int a=3; a<=30; a+=3){
            System.out.print(" "+a);
        }
        System.out.println();
        for (int b =1; b<=30; b++){
            if (b%3!=0){
                System.out.print(" "+b);
            }
        }
    }
    
}
