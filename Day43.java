import java.util.*;

public class Day43 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai pertama: ");
        int a = in.nextInt();
        System.out.println("Masukkan nilai kedua: ");
        int b = in.nextInt();
        boolean  c = a <= b;
        boolean d=  a >= b;

        System.out.printf("Jadi jika  %d <= %d maka %b\n", a, b, c);
        System.out.printf("Tetapi jika %d >= %d  maka %b\n", a, b, d);


    }
}
