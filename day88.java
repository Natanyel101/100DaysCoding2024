package isc;
import java.util.*;

public class day88{
    public static void main(String[] args) {
        int[] nilaiSiswa = {80, 95, 70, 90, 85, 75, 95, 84, 74, 90};
        double jumlahTotal = 0;
        int nilaiTertinggi = nilaiSiswa[0],nilaiTerendah = nilaiSiswa[0];
        for (int nilaiSaatIni : nilaiSiswa) {
            jumlahTotal += nilaiSaatIni;
            if (nilaiSaatIni > nilaiTertinggi) {
                nilaiTertinggi = nilaiSaatIni;
            }
            else if (nilaiSaatIni < nilaiTerendah){
                nilaiTerendah = nilaiSaatIni;
            }
        }
        double rataRata = jumlahTotal / nilaiSiswa.length;
        
        System.out.println("Nilai siswa: " + Arrays.toString(nilaiSiswa));
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        
        int jumlahDiAtasRataRata = 0;
        for (int nilaiSaatIni : nilaiSiswa) {
            if (nilaiSaatIni > rataRata) {
                jumlahDiAtasRataRata++;
            }
        }
        System.out.println("Jumlah siswa dengan nilai di atas rata-rata: " + jumlahDiAtasRataRata);
    }
}
