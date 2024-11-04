package isc;

public class day64 {
    
    public static void main(String[] args) {
        zee:
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println("angka a ke-" + a + ", angka b ke- " + b);
                if (b == 5) {
                    break zee;
                }
            }
        }
        System.out.println("Loop selesai.");
    }
}
