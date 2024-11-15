package isc;

import java.util.*;
public class day75 {
    public static void main(String[] args) {
        Scanner zee = new Scanner(System.in);
        String oke="tidak dapat login";
        System.out.println(oke);
        for (;;) {
            System.out.print("(lanjutkan/stop)");
            String a = zee.nextLine().toLowerCase();
            if (a.equals("lanjutkan")) {
                for (int i = 0; i < 1; i++) {
                    System.out.println(oke);
                }
            } else if (a.equals("stop")) {
                System.out.println("silahkan ganti kata sandi anda!!");
                break;
            }
        }
    }
}
