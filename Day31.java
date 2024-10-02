package isc;

public class day31 {
    
    public static void main(String[] args) {
        //konfersi tipe data String ke primitif
        String gg="48";//tipe data string
        String you="Z";//tepe data string
        int sip = Integer.parseInt(gg);//konfersi string ke int
        byte oke = Byte.parseByte(gg);//konfersi string ke byte
        System.out.println("hasil konfersi string ke primitif: "+sip);
        System.out.println("hasil konfersi string ke byte: "+oke);
    }
    
}
