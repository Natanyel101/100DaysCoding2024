package isc;

public class day62 {
    
    public static void main(String[] args) {
        int a=0;
        for ( ;a<=10; a++){
            System.out.println("angka ke-"+a);
            if (a==5){
                break;                
            }
        }
        System.out.println("berhenti di angka ke-"+a);
    }
    
}
