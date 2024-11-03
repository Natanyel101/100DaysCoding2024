package isc;

public class day63 {
    
    public static void main(String[] args) {
        int a=0;
        for ( ;a<=10; a++){
            if (a==5){
                System.out.println("melompat di sini");
                continue;
          }
            System.out.println("angka ke-"+a);
        }
        System.out.println("berhenti di angka ke-"+a);
    }
    
}
